public class PairUtil extends Pair {
    public static<T> Pair swap(Pair<T> para){
        T pierwsze = para.getFirst();
        T drugie = para.getSecond();
        return new Pair(drugie,pierwsze);
    }
}
