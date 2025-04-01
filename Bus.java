package InterviewQuestion;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Bus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int totalSeat=40;
		int seatPerRow=4;
		
		List<Integer> leftW=IntStream.rangeClosed(1, totalSeat).filter(seat->(seat-1)% seatPerRow==0).boxed().collect(Collectors.toList());
		
		
		List<Integer> rightW= IntStream.rangeClosed(1, totalSeat).filter(seat->seat% seatPerRow==0).boxed().collect(Collectors.toList());
		
		System.out.println(leftW);

		System.out.println(rightW);
	}

}
