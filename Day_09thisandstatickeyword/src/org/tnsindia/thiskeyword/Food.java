package org.tnsindia.thiskeyword;

public class Food {
	//data members
		public String Food_type;
		public String food_name;
		
		//default constructor
		Food()
		{
			Food_type="Chinese";
			food_name="Hakka Noodles";
		}
		
		/*the below method is returning the current class instance by
		using this keyword*/
		Food get1()
		{
			System.out.println("Food Type is: "+Food_type+" "
					+"Food Name is: "+food_name);
			return this;
		}
}