package Com.hashset;

public class Student1{

	//data members of studnet class
		private int id;
		private String name;
		private String contno;
		
		public Student1() { // generate default constructor
			super();
		}
		
		public Student1(int id, String name, String contno) {  //generate parameterized constructor
			super();
			this.id = id;
			this.name = name;
			this.contno = contno;
		}

		//generate getters and settters
		public int getId() {  //get id
			return id;
		}

		public void setId(int id) { //set id
			this.id = id;
		}

		public String getName() { //get name
			return name;
		}

		public void setName(String name) { //set name
			this.name = name;
		}

		public String getContno() { //get contno
			return contno;
		}

		public void setContno(String contno) { // set contno
			this.contno = contno;
		}

		@Override
		public String toString() { //generate tostring method
			return "Student1 [id=" + id + ", name=" + name + ", contno=" + contno + "]";
		}


	}


