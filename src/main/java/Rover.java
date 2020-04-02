public class Rover {
    public Rover(Planet planet, Position position, int direction, boolean state){
        this.planet = planet;
        this.position = position;
        this.direction = direction;
        this.state = state;
    }

    private Planet planet;
    private Position position;
    private int direction;
    private boolean state;

    @Override
    public String toString() {
        return "Rover{" +
                "position=" + position +
                ", direction=" + direction +
                '}';
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public Planet getPlanet() {
        return planet;
    }

    public void setPlanet(Planet planet) {
        this.planet = planet;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public void goLeft(){
        if (this.isState()){
            System.out.println("Vous devez vous arretez");
        }else{
            if (this.getDirection() == 4){
                this.setDirection(1);
            }else{
                this.setDirection(this.getDirection()+1);
            }
        }
    }

    public void goRight(){
        if (this.isState()){
            System.out.println("Vous devez vous arretez");
        }else{
            if (this.getDirection() == 1){
                this.setDirection(3);
            }else{
                this.setDirection(this.getDirection()+1);
            }
        }
    }

    public void goForward(){
        this.setState(true);
        int direction = this.getDirection();
        if (direction == 1) {
            this.position.setheight(this.position.getheight() + 1);
            int maxHeight = planet.getMaxHeight();
            if (this.position.getheight() < maxHeight) {
                this.position.setheight(this.position.getheight() + 1);
                System.out.println("Le rover a avancé");
            } else {
                System.out.println("Le rover a bien avancé d'une case");
            }
        }
         if (direction == 2) {
             this.position.setwidth(this.position.getwidth() - 1);
             if (this.position.getwidth() < this.planet.getMinWidth()) {
                 this.position.setheight(10);
                 this.position.setwidth(10);
                 System.out.println("Le rover est retourné à la position initiale");
             } else {
                 System.out.println("Le rover a bien avancé d'une case");
             }
         }
         if (direction == 3) {
             this.position.setheight(this.position.getheight() - 1);
             if (this.position.getheight() < this.planet.getMinHeight()) {
                 this.position.setheight(10);
                 this.position.setwidth(10);
                 System.out.println("Le rover est retourné à la position initiale");
             } else {
                 System.out.println("Le rover a bien avancé d'une case");
             }
         }
         if (direction == 4){
             this.position.setwidth(this.position.getwidth()+1);
             if (this.position.getwidth() > this.planet.getMaxHeight()){
                 this.position.setheight(10);
                 this.position.setwidth(10);
                 System.out.println("Le rover est retourné à la position initiale");
             }else{
                 System.out.println("Le rover a bien avancé d'une case");
             }
     }

    }

    public void goBackward(){
        this.setState(true);
        int direction = this.getDirection();
        if (direction == 1) {
            this.position.setheight(this.position.getheight() - 1);
            if (this.position.getheight() < this.planet.getMinHeight()) {
                this.position.setheight(10);
                this.position.setwidth(10);
                System.out.println("Le rover est retourné à la position initiale");
            } else {
                System.out.println("Le rover a bien reculé d'une case");
            }
        }
        if (direction == 2) {
            this.position.setwidth(this.position.getwidth() + 1);
            if (this.position.getwidth() > this.planet.getMaxWidth()) {
                this.position.setheight(10);
                this.position.setwidth(10);
                System.out.println("Le rover est retourné à la position initiale");
            } else {
                System.out.println("Le rover a bien reculé d'une case");
            }
        }
         if (direction == 3) {
             this.position.setheight(this.position.getheight() + 1);
             if (this.position.getheight() > this.planet.getMaxHeight()) {
                 this.position.setheight(10);
                 this.position.setwidth(10);
                 System.out.println("Le rover est retourné à la position initiale");
             } else {
                 System.out.println("Le rover a bien reculé d'une case");
             }
         }
         if (direction == 4){
                this.position.setwidth(this.position.getwidth()-1);
                if (this.position.getwidth() < this.planet.getMinWidth()){
                    this.position.setheight(10);
                    this.position.setwidth(10);
                    System.out.println("Le rover est retourné à la position initiale");
                }else{
                    System.out.println("Le rover a bien reculé d'une case");
                }
        }
    }
    public void stop(){
        this.setState(false);
        System.out.println("Vous venez de vous arretez");
    }


}
