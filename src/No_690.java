import java.util.*;

/**
 * Created by huang on 2017/10/3.
 */
public class No_690 {
    class Employee {
        // It's the unique id of each node;
        // unique id of this employee
        public int id;
        // the importance value of this employee
        public int importance;
        // the id of direct subordinates
        public List<Integer> subordinates;
    };

    class Solution {

        public int getImportance(List<Employee> employees, int id) {
            Map<Integer, Employee> employeeMap = new HashMap<>();
            for (Employee employee: employees) {
                employeeMap.put(employee.id, employee);
            }

            int importance = 0;
            Queue<Employee> employeeQueue = new LinkedList<>();
            Employee root = employeeMap.get(id);
            employeeQueue.offer(root);

            while (!employees.isEmpty()) {
                Employee current = employeeQueue.poll();
                importance += current.importance;
                for (Integer subordinateId: current.subordinates) {
                    employeeQueue.offer(employeeMap.get(subordinateId));
                }
            }
            return importance;
        }
    }
}
