import java.util.stream.IntStream;

public class Sum {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i <= 10; i++)
			sum += i;
		System.out.println("1~10を足した合計は" + sum + "です");

		System.out.println(IntStream.rangeClosed(0, 10).sum());

	}

}
