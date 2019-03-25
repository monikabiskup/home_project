package pl.javastart;

public class FIzzBuzz {

        public static void main(String[] args) {
           StringBuilder builder = new StringBuilder(1000);

            for (int i = 0; i < 100; i++) {
                final int length = builder.length();

                if(i%3 == 0) builder.append("Fizz");
                if(i%5 == 0) builder.append("Buzz");
                if (builder.length() == length) builder.append(i);
                builder.append('\n');
            }
            System.out.println(builder);

        }
    }