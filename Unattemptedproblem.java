import java.util.*;
class Unattemptedproblem
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
        int totalProblems = scanner.nextInt();
        int attemptedProblems = scanner.nextInt();
        int unattemptedProblems = totalProblems - attemptedProblems;
        System.out.println(+unattemptedProblems);
	}
}
