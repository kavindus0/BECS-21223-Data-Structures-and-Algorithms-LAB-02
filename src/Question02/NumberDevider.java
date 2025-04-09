package Question02;

public class NumberDevider {
    int numberSize ;
    int Number;
    int midValue;

    public NumberDevider(int number) {
        char[] digitList = Integer.toString(number).toCharArray();
        this.Number = number;
        this.numberSize = digitList.length;
        this.midValue = numberSize/2;
    }

    public int NumberDeviderMethod(){
        String Numb = Integer.toString(Number);
        char[] digitList = Numb.toCharArray();
        Queue mainQueueHoldAllNumbers = new Queue(numberSize);
        while (mainQueueHoldAllNumbers.IsQueueEmpty()) {
            for (int i = midValue; i < digitList.length; i++) {
                mainQueueHoldAllNumbers.Append(digitList[i]);
            }
            for (int i = 0; i < midValue; i++) {
                mainQueueHoldAllNumbers.Append(digitList[i]);
            }
        }
        System.out.println(mainQueueHoldAllNumbers.queue);

    return Integer.parseInt(String.valueOf(mainQueueHoldAllNumbers.queue));
    }

}
