public interface TyreChangeable {
    default void changeTyre(int tyreCount){
        for (int i = 0; i < tyreCount; i++) {
            System.out.println("Меняем покрышку");
        }

    }


}
