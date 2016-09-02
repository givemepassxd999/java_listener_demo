/**
 * Created by rick.wu on 2016/9/2.
 */
public class A {
    public interface OnCompletedListener{
        void onCompleted(String result);
    }
    private OnCompletedListener mOnCompletedListener;
    public void setOnCompletedListener(OnCompletedListener listener){
        mOnCompletedListener = listener;
    }

    public void handleLongTask(){
        try {
            System.out.println("A task is running.");
            Thread.sleep(1000);
            if(mOnCompletedListener != null){
                mOnCompletedListener.onCompleted("ok");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
