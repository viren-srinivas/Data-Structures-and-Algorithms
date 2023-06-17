//Name: Viren Srinivas
// Task: MSI Pre - Interview Question - Shortest Path

package Test;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

/*
This solution uses a modified version of depth first search to retrieve the shortest path between two employees.
The DFS traverse is from root (ceo) down to the node (first employee and second employee) such that the paths are saved using
a stack. Once the paths are retrieved, we will walk along either path (from top/bottom of stack i.e. depending on size of path) upto the difference of both
the paths to retrieve the path upto the difference of both the paths. Then we traverse along both the paths until the common parent node is reached and
then the shortest path is returned.

Time Complexity: To get root to target path in DFS, we need to traverse the whole tree, which costs O(n) time, where n is the number of employees here.
Space Complexity: The height of the tree can reach upto O(h) worse case target employee being the deepest node, hence size of the path list will be O(h), where h
is the height of the binary tree.

 */

public class Company {

    // IMPORTANT: DO NOT MODIFY THIS CLASS
    public static class Employee {

        private final int id;
        private final String name;
        private List<Employee> reports;

        public Employee(int id, String name) {
            this.id = id;
            this.name = name;
            this.reports = new ArrayList<Employee>();
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public List<Employee> getReports() {
            return reports;
        }

        public void addReport(Employee employee) {
            reports.add(employee);
        }
    }

    /*
     * Read the attached PDF for more explanation about the problem
     * Note: Don't modify the signature of this function
     * @param ceo
     *
     * @param firstEmployee
     *
     * @param secondEmployee
     *
     * @return the shortest path from First Employee to the Second Employee.
     */
    @SuppressWarnings("unused")
    public static String shortestPath(Employee ceo, Employee firstEmployee, Employee secondEmployee) {
        // Implement me

        Stack<Employee> firstPath = new Stack<Employee>();
        Stack<Employee> secondPath = new Stack<Employee>();
        String shortestPath = "";

        Employee root = ceo;
        DFS(root, firstEmployee, firstPath);
        DFS(root, secondEmployee, secondPath);

        if (firstPath.peek().getId() == firstEmployee.getId() && secondPath.peek().getId() == secondEmployee.getId())
        {
            int firstPathSize = firstPath.size();
            int secondPathSize = secondPath.size();
            int diff = Math.abs(firstPathSize - secondPathSize);


            if (firstEmployee.getReports().contains(secondEmployee) || secondEmployee.getReports().contains(firstEmployee)) {
                shortestPath = shortestPath + firstEmployee.getName() + " > " + secondEmployee.getName();
            }
            else
            {

                if (firstPathSize >= secondPathSize)
                {

                    shortestPath = shortestPath + getPathUptoDiffFromTop(firstPath, diff);
                    if (firstPath.peek().getId() != secondPath.peek().getId())
                    {
                        shortestPath = shortestPath + firstPath.peek().getName() + " > ";
                        firstPath.pop();
                        shortestPath = shortestPath + firstPath.peek().getName() + " > ";
                        firstPath.pop();
                        shortestPath = shortestPath + secondPath.peek().getName();
                    }
                    else
                    {
                        shortestPath = shortestPath + secondPath.peek().getName();
                    }

                }
                else {

                    String pathUptoDiffFromBottom = getPathUptoDiffFromBottom(secondPath,diff);
                    if(firstPath.peek().getId() != secondPath.peek().getId()) {
                        shortestPath = shortestPath + firstPath.peek().getName() + " > ";
                        firstPath.pop();
                        shortestPath = shortestPath + firstPath.peek().getName() + " > ";
                        firstPath.pop();
                        shortestPath = shortestPath + secondPath.peek().getName() + " > " + pathUptoDiffFromBottom;

                    }
                    else
                    {
                        shortestPath = shortestPath + secondPath.peek().getName()+" > "+pathUptoDiffFromBottom;
                    }


                }
            }
        }
        return shortestPath;
    }

    //Depth First Search to return the path from root to target employee
    private static boolean DFS(Employee root, Employee target, Stack<Employee> path){
        path.push(root);
        if(root.getId() == target.getId()){
            return true;
        }

        for(Employee r : root.getReports()){
            boolean res = DFS(r, target, path);
            if(res){
                return true;
            }
        }

        path.pop();

        return false;
    }

    //Returns the string containing path up to the difference between the size of both paths (order from top of stack)
    private static String getPathUptoDiffFromTop(Stack<Employee> path, int diff){
        String pathString = "";
        while(diff > 0 && !path.isEmpty()){
            pathString=pathString+path.peek().getName()+" > ";
            path.pop();
            diff--;
        }
        return pathString;
    }

    //Returns the string containing path up to the difference between the size of both paths (order from bottom of stack)
    private static String getPathUptoDiffFromBottom(Stack<Employee> path, int diff){
        String pathString = "";
        ArrayList<String> pathStringList=new ArrayList<String>();
        while(diff > 0 && !path.isEmpty()){
            pathStringList.add(path.peek().getName());
            path.pop();
            diff--;
        }
        for(int i=pathStringList.size()-1;i>=0;i--)
        {
            pathString=pathString+pathStringList.get(i);
            if(i>0)
            {
                pathString=pathString+" > ";
            }
        }

        return pathString;
    }


    public static void main(String[] args) {
        Employee Eugene = new Employee(1, "Eugene");
        Employee Jose = new Employee(2, "Jose");
        Employee Kelvin = new Employee(3, "Kelvin");
        Employee Terence = new Employee(4, "Terence");
        Employee Dennis = new Employee(5, "Dennis");
        Employee Eunice = new Employee(6, "Eunice");
        Employee Bryan = new Employee(7, "Bryan");
        Employee Gabriel = new Employee(8, "Gabriel");
        Employee Jimmy = new Employee(9,"Jimmy");

        Eugene.addReport(Jose);
        Eugene.addReport(Kelvin);
        Eugene.addReport(Terence);

        Jose.addReport(Dennis);
        Jose.addReport(Eunice);
        Jose.addReport(Bryan);

        Eunice.addReport(Gabriel);
        Eunice.addReport(Jimmy);



        System.out.println(shortestPath(Eugene,Gabriel,Jimmy));
        System.out.println(shortestPath(Eugene,Jimmy,Bryan));
        System.out.println(shortestPath(Eugene,Jimmy,Kelvin));
        System.out.println(shortestPath(Eugene,Eunice,Jimmy));
        System.out.println(shortestPath(Eugene,Terence,Eugene));
        System.out.println(shortestPath(Eugene,Jimmy,Jose));
        System.out.println(shortestPath(Eugene,Jimmy,Bryan));
        System.out.println(shortestPath(Eugene,Bryan,Jimmy));
        System.out.println(shortestPath(Eugene,Jimmy,Terence));
        System.out.println(shortestPath(Eugene,Terence,Jimmy));
        System.out.println(shortestPath(Eugene,Jose,Jimmy));
        System.out.println(shortestPath(Eugene,Jimmy,Eugene));
        System.out.println(shortestPath(Eugene,Eugene,Jimmy));
        System.out.println(shortestPath(Eugene,Eugene,Eunice));
        System.out.println(shortestPath(Eugene,Eugene,Bryan));
        System.out.println(shortestPath(Eugene,Bryan,Kelvin));
        System.out.println(shortestPath(Eugene,Gabriel,Jimmy));
        System.out.println(shortestPath(Eugene,Gabriel,Bryan));
        System.out.println(shortestPath(Eugene,Jose,Dennis));
        System.out.println(shortestPath(Eugene,Eugene,Gabriel));

    }
};

