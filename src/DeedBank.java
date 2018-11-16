public class DeedBank {
    private Street[] streets = new Street[]{new Street("gade1",0),new Street("gade2",1)};
    private Player[] owners = new Player[streets.length];
    private Group[] groups = new Group[10];


    public void setUpGroups(){
        Group group1 = new Group("White", new Street[]{streets[0],streets[1]});
    }

    public void setOwner(int fieldNo, Player p){
        owners[0] = p;
    }

    public Player getOwner(int fieldNo){
        return owners[0];
    }

    public Street[] getPlayersFields(Player p){

        int countOwned = 0;
        for (int i = 0; i< streets.length; i++){
            if (owners[i].equals(p)){
                countOwned++;
            }
        }
        int playerStreetNo = 0;
        Street[] playerStreets = new Street[countOwned];
        for (int i = 0; i< streets.length; i++){
            if (owners[i].equals(p)){
                playerStreets[playerStreetNo] = streets[i];
                playerStreetNo++;
            }
        }

        return playerStreets;
    }


}
