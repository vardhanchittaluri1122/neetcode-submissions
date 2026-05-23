class Solution {

    int[] stack = new int[1000];

    int top = -1;

    // PUSH
    public void push(int value) {

        top++;

        stack[top] = value;
    }

    // POP
    public int pop() {

        int removed = stack[top];

        top--;

        return removed;
    }

    // PEEK
    public int peek() {

        return stack[top];
    }

    // SIZE
    public int size() {

        return top + 1;
    }

    public int calPoints(String[] operations) {

        int sum = 0;

        for(int i = 0; i < operations.length; i++) {

            if(operations[i].equals("+")) {

                int first = pop();

                int second = peek();


                int newScore = first + second;
                push(first);

                push(newScore);

                sum += newScore;
            }

            else if(operations[i].equals("D")) {

                int newScore = peek() * 2;

                push(newScore);

                sum += newScore;
            }

            else if(operations[i].equals("C")) {

                int removed = pop();

                sum -= removed;
            }

            else {

                int num = Integer.parseInt(operations[i]);

                push(num);

                sum += num;
            }
        }

        return sum;
    }
}