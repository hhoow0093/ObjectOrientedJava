package howard.application;

import howard.data.Category;

public class CategoryApp {
    public static void main(String[] args) {
        Category category1 = new Category();
        category1.setId("3");
        category1.setExpensive(false);

        System.out.println(category1.getId());
        System.out.println(category1.IsExpensive());

        category1.setId(null);
        category1.setExpensive(true);

        System.out.println(category1.getId());
        System.out.println(category1.IsExpensive());
    }

}
