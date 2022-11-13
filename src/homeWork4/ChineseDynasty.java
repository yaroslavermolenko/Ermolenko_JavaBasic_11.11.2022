package homeWork4;

public class ChineseDynasty {
    public static void main(String[] args) {

        int liWarrior = 13;
        int liArcher = 24;
        int liHorseman = 46;
        int eachTypeLiWarAmount = 860;

        int minWarrior = 9;
        int minArcher = 35;
        int minHorseman = 12;
        double eachTypeMinWarAmount = 860 * 1.5;

        int totalAttackLi = (liWarrior * eachTypeLiWarAmount) + (liArcher * eachTypeLiWarAmount) + (liHorseman * eachTypeLiWarAmount);
        int totalAttackMin = (int) ((minWarrior * eachTypeMinWarAmount) + (minArcher * eachTypeMinWarAmount) + (minHorseman * eachTypeMinWarAmount));

        System.out.println("Total attack Li army " + totalAttackLi);
        System.out.println("Total attack Ming army " + totalAttackMin);
    }
}