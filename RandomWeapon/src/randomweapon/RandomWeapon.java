/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomweapon;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Shawn
 */
public class RandomWeapon {
    
    // Weapon array denoting rarity, base, barrel, stock, scope, damage,
    // accuracy, range respectively 
    public static int[] weapon = new int[8];
    
    // Min value for each field
    public static int min = 1;
    
    // Base: 1 = Pistol, 2 = Rifle, 3 = SMG, 4 = Shotgun, 5 = Assult Rifle
    public static int maxBase = 5;
    
    // Barrel: short, medium, long
    public static int maxBarrel = 3;
    
    // Stock: light, heavy
    public static int maxStock = 2;
    
    // Scople: iron-sights, red dot, 4x, 8x, 12x
    public static int maxScope = 5;
    
    // min/max Damage, Accuracy, Range
    public static int minDamage = 10;
    public static int maxDamage = 22;
    public static int minAccuracy = 70;
    public static int maxAccuracy = 90;
    public static int minRange = 15;
    public static int maxRange = 30;
    
    public static void main(String[] args) {
        
        // Gets input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number for rarity DELETE print later\n");
        int rarity = scan.nextInt();
        scan.close();
        
        // update weapon rarity
        weapon[0] = rarity;
        
        // Create random base of weapon
        Random rn = new Random();
        int base = rn.nextInt(maxBase - min + 1 ) + min;
        weapon[1] = base;
        
        // Create random barrel of weapon
        int barrel = rn.nextInt(maxBarrel - min + 1 ) + min;
        weapon[2] = barrel;
        
        // Create random stock of weapon
        int stock = rn.nextInt(maxStock - min + 1 ) + min;
        weapon[3] = stock;
        
        // Create random stock of weapon
        int scope = rn.nextInt(maxScope - min + 1 ) + min;
        weapon[4] = (int) (scope * ((rarity *.1)+1));
        
        // Generate damage based off barrel and rarity
        int damage = rn.nextInt(maxDamage - minDamage + 1) + minDamage;
        weapon[5] = (int) (damage* ((rarity *.1)+1));
        
        // Generate accuracy based off stock and rarity
        int accuracy = rn.nextInt(maxAccuracy - minAccuracy + 1) + minAccuracy;
        weapon[6] = (int) (accuracy* ((rarity *.05)+1));
        
        // Generate range based off scope and rarity
        int range = rn.nextInt(maxRange - minRange + 1) + minRange;
        weapon[7] = (int) (range * ((rarity *.1)+1));
        
        for ( int i =0; i < 8; i++) {
            System.out.print(weapon[i]+" ");
        }
    }
    
}
