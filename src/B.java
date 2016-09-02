/**
 * Created by rick.wu on 2016/9/2.
 */
public class B {
    private A a;

    public B(A a) {
        this.a = a;
        a.setOnCompletedListener(new A.OnCompletedListener() {
            @Override
            public void onCompleted(String result) {
                if(result.equals("ok")){
                    System.out.println("A task is finished.");
                }
            }
        });
    }

    public void handleEvent(){
        int i = 0;
        while(i < 100){
            i++;
        }
        System.out.println("B task is finished");
    }
}
