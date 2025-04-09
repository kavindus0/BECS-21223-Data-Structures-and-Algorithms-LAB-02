package Question01;

import java.util.Arrays;

public class StringConcator {

    String str01;
    String str02;

    public StringConcator(String str01, String str02) {
        this.str01 = str01;
        this.str02 = str02;
    }

    public String StringConcatMethod() {
        Queue q4str01 = new Queue(str01.length());
        Queue q4str02 = new Queue(str02.length());
        Queue q4all = new Queue(q4str01.maxSize + q4str02.maxSize);

        while (q4all.IsQueueEmpty()){
            char[] q1charArray =str01.toCharArray();
            char[] q2charArray =str02.toCharArray();
            for (char i : q1charArray
                 ) {
                    q4all.Append(i);
            }
            for (char i2:q2charArray
                 ) {
                q4all.Append(i2);

            }

        }

        System.out.println(q4all.queue);
        return Arrays.toString(q4all.queue);

    }





}
