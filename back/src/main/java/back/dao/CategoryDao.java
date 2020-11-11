package back.dao;

import back.model.Category;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CategoryDao {

    public List<Category> findAllCategories() {
        List<Category> list = new ArrayList<>();
        return list;
    }
}
