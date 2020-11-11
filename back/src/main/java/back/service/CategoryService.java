package back.service;

import java.util.List;
import java.util.Locale;

public interface CategoryService {
    //질의용 메서드
    public List<Category> findCategoryGroup(String categoryGroupKey);
    /*적재용 메서드
    언제 호출해야 하는가? 문제가 발생
    캐시를 사용하기 전에 적재해야 한다...
    호출 하는쪽에서 적재 여부를 확인하지 않고 호출 가능할까?
     -> X
    호출 받는 이 캐시 서비스 클래스 측에서 적재 여부를 판단하는 것이 쉽다.
    적재 메서드를 통해 데이터 베이스에서 가져오는 작업은
    상당한 시간이 소요. 동시 사용자가 많은 환경에서는
    이러한 초기화 작업이 다수 발생할 수 있기 때문.
    */
    public void loadCategoryGroups();
    // 초기화 메서드
    public void invalidateCategoryGroups();


}
