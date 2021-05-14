package entities;

public class Employee {
   
        private Integer id;
        private String name;
        private Double salary;
        
        
        
        
		public Employee(Integer id, String name, double salary) {
			
			this.id = id;
			this.name = name;
			this.salary = salary;
		}




		public Integer getId() {
			return id;
		}




		public void setId(Integer id) {
			this.id = id;
		}




		public String getName() {
			return name;
		}




		public void setName(String name) {
			this.name = name;
		}




		public double getSalary() {
			return salary;
		}
		
		public void setSalary(Double Salary) {
			this.salary = salary;
		}

		
		public void porcentage (double porcentagem) {
			salary += salary * porcentagem / 100.0;
		}
		
		
		public String toString() {
			return id 
				   + ", "
				   + name
				   +", "
				   + String.format("%.2f", salary);
		}
        
        
        
	
	
    }
	
	
	
	

