package Model;

public enum PetType {
    
    Cat,
    Dog,
    Hamster;

    public static PetType getType (int typeId){
        switch (typeId){
            case 1:
                return PetType.Cat;
            case 2:
                return PetType.Dog;
            case 3:
                return PetType.Hamster;
            default:
                return null;
        }
    }
}
