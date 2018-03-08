public class TrappingRain {

    public TrappingRain(){

    }

    Integer[]wallHeight;

    public Integer getHeighestWallToTheLeft(Integer[]wallHeight,Integer indexOfWall){
        Integer maxLeft =wallHeight[indexOfWall];
            for (int i = 0; i < indexOfWall; i++) {
                if (wallHeight[i] > maxLeft) {
                    maxLeft = wallHeight[i];
                }
            }

        return maxLeft;
    }

    public Integer getHighestWallToTheRight(Integer[]wallHeight,Integer indexOfWall){
        Integer maxRight = wallHeight[indexOfWall];
        for(int i=indexOfWall;i<wallHeight.length;i++){
            if(wallHeight[i]>maxRight){
                maxRight = wallHeight[i];
            }
        }
        return maxRight;
    }


    public Integer getWaterTrappedAtIndex(Integer[] wallHeight, Integer indexOfWall){
        return Math.min(getHeighestWallToTheLeft(wallHeight,indexOfWall),
                getHighestWallToTheRight(wallHeight,indexOfWall))-wallHeight[indexOfWall];
    }

    public Integer getTotalWaterTrapped(Integer[]wallHeight){
        Integer totalWater = 0;
        for(int i =0;i<wallHeight.length;i++){
            totalWater+=getWaterTrappedAtIndex(wallHeight,i);
        }
        return totalWater;
    }


}
