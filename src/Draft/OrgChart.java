package Draft;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class OrgChart {
	
	public static void main(String[] args) {
		Organization org = new Organization();
		org.add(10, "Sharilyn Gruber", -1);
		org.add(7, "Denice Mattice", 10);
		org.add(3, "Lawana Futrell", -1);
		org.add(34, "Lissette Gorney", 7);
		org.add(5, "Lan Puls", 3);
		org.print();
		System.out.println("-----------------");
		org.move(5, 10);
		org.print();
		System.out.println("------------------");
		System.out.println(org.count(10));
	}
	
	static class Organization {
		
		Map<Integer, Employee> empMap = new HashMap<>();
		
		public void add(int id, String name, int managerId) {
			Employee emp = new Employee(id, name, managerId);
			empMap.put(id, emp);
		}
		
		public void remove(int id) {
			empMap.remove(id);
		}
		
		public void move(int id, int managerId) {
			empMap.get(id).managerId = managerId;
		}
		
		
		
		public void print() {
			Set<Integer> empExists = new HashSet<>();
			Map<Integer, Set<Employee>> groupEmp = new HashMap<>();
			
			for(Employee emp : empMap.values()) {
				groupEmp.putIfAbsent(emp.managerId, new HashSet<>());
				groupEmp.get(emp.managerId).add(emp);
			}
			helper(groupEmp, empExists, -1, "");
		}
				

		private void helper(Map<Integer, Set<Employee>> groupEmp, Set<Integer> empExists, int managerId, String spaceStr) {
			
			for( Employee emp : groupEmp.getOrDefault(managerId, new HashSet<>()) ) {
				if(!empExists.contains(emp.id)) {
					System.out.println(spaceStr + emp);
					empExists.add(emp.id);
					helper(groupEmp, empExists, emp.id, spaceStr + "  ");
				}
			}
			
		}
		
		private int count(int managerId) {
			if(!empMap.containsKey(managerId)) {
				return -1;
			}	
			Set<Integer> empExists = new HashSet<>();
			Map<Integer, Set<Employee>> groupEmp = new HashMap<>();
			for(Employee emp : empMap.values()) {
				groupEmp.putIfAbsent(emp.managerId, new HashSet<>());
				groupEmp.get(emp.managerId).add(emp);
			}
			return helper(groupEmp, empExists, managerId);
		}
		
		private int helper(Map<Integer, Set<Employee>> groupEmp, Set<Integer> empExists, int managerId) {
			int res = 0;
			for(Employee emp : groupEmp.getOrDefault(managerId, new HashSet<>())) {
				if(!empExists.contains(emp.id)) {
					empExists.add(emp.id);
					res += (1 + helper(groupEmp, empExists, emp.id)); 
				}
			}
			return res;
		}
		
	}
	
	static class Employee {
		
		int id;
		String name;
		int managerId;

		public Employee(int id, String name, int managerId) {
			this.id = id;
			this.name = name;
			this.managerId = managerId;
		}
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getManagerId() {
			return managerId;
		}

		public void setManagerId(int managerId) {
			this.managerId = managerId;
		}
		
		@Override
		public String toString() {
			return name + "[" + id + "]";
		}
	}
}
