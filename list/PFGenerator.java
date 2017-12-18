public class PFGenerator extends AbstractorIterator<Integer> {
    protected int base;
    protected int f;
    protected int n;

    public PFGenerator(int value){
        base=value;
        reset();

    }
    @Override
    public void remove() {
        super.remove();
    }

    @Override
    public Integer get() {
        while (f<=n && n%f!=0) f++;
        return f;
    }

    @Override
    public Integer next() {
        Integer result=get();
        n/=f;
        return result;
    }

    @Override
    public void reset() {
        n=base;
        f=2;
    }
    public boolean hasNext(){
        return f<=n;
    }
}
