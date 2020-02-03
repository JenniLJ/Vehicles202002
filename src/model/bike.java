public class Bike {
		
		private double frameSize;
		private String brand;
		private String color;
		
		public Bike() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Bike(double frameSize, String brand, String color) {
			super();
			this.frameSize = frameSize;
			this.brand = brand;
			this.color = color;
		}

		public double getFrameSize() {
			return frameSize;
		}

		public void setFrameSize(double frameSize) {
			this.frameSize = frameSize;
		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}
		
		public String makeNoise() {
			return "ring ring!";
				
		}

		
	}
