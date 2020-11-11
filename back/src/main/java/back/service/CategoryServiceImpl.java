package back.service;

import back.dao.CategoryDao;
import back.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryDao categoryDao;

    private final Map<String, List<Category>> categoryGroups = new HashMap<>();

    @Override
    public List<Category> findCategoryGroup(String categoryGroupKey) {
        if(categoryGroups.isEmpty()){
            synchronized (categoryGroups){ //multi thread로 동시접근되는 것을 막기위함 동기화 제어
                if(categoryGroups.isEmpty()){
                    Map<String,List<Category>> map = new HashMap<String,List<Category>>();
                    List<Category> list = categoryDao.findAllCategories();
                    for (Category c: list) {
                        map.put(c.get,c);
                    }
                    categoryGroups.clear();
                    categoryGroups.putAll(map);
                }
            }
        }
        return categoryGroups.get(categoryGroupKey);
    }

    @Override
    public void loadCategoryGroups() {

    }

    @Override
    public void invalidateCategoryGroups() {
        categoryGroups.clear();
    }
}
