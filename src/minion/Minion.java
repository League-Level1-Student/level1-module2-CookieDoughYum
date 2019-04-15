package minion;

public class Minion {
		private String name;
		private int eyes;
		private String color;
		private String master;
		Minion(String name, int eyes, String color, String master){
			this.name=name;
			this.eyes=eyes;
			this.color=color;
			this.master=master;
		}
			String getName() {
				return this.name;
			}
			void setName(String name) {
				this.name=name;
			}
			int getEyes() {
				return this.eyes;
			}
			void setEyes(int eyes) {
				this.eyes=eyes;
			}
			String getColor() {
				return this.color;
			}
			void setColor(String color) {
				this.color=color;
			}
			String getMaster() {
				return this.master;
			}
			void setMaster(String master) {
				this.master=master;
			}
		
	}

