public class Main {

  public static String fromGradeString(int[] grades) {
    String result = "";
    for (int grade : grades) {
      if ( grade >= 90) result += "A";
      else if ( grade >= 80) result += "B";
      else if ( grade >= 70) result += "C";
      else if ( grade >= 60) result += "D";
      else if ( grade >= 0) result += "F";
    
    };
    return result;
  }

  public static String valedictorianName(String[] studentNames, double[] studentGrades) {
    String result = "";
    double max = 0;
    for (int i = 0; i < studentGrades.length; i++) {
      if (studentGrades[i] > max) {
        max = studentGrades[i];
        result = studentNames[i];
      }
    }
    return result;
  }


  public static int[] longestPlateau(int[] nums) {
      int[] result = new int[2];
      int max = 0;
      int index = 0;
      for (int i = 0; i < nums.length; i++) {
        int count = 0;
        int j = i;
        while (j < nums.length && nums[j] == nums[i]) {
          count++;
          j++;
        }
        if (count > max && i > 0 && j < nums.length && nums[i] > nums[i-1] && nums[i] > nums[j]) {
          max = count;
          index = i;
        }
      }
      result[0] = max;
      result[1] = index;
      return result;

  }

  
  



  
  public static void main(String[] args) {
    int[] grades = {62, 79, 99, 50};
    System.out.println(fromGradeString(grades));
    String[] names = {"emily", "albert", "sophie", "phillip", "ophelia"};
    double[] gpa = {0.223, 3.538, 3.237, 1.437, 1.162};
    System.out.println(valedictorianName(names, gpa));
    int[] nums = {0, 1, 1, 1, 1, 0, 3, 3, 2, 2};
    System.out.println(longestPlateau(nums)[0] + " " + longestPlateau(nums)[1]);
  }
}