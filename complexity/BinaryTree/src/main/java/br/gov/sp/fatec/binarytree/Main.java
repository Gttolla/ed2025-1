/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.gov.sp.fatec.binarytree;

/**
 *
 * @author amaffeis
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Binary Tree");
        BinaryTree btree = new BinaryTree();
        int vet[] = { 10,3,11,15,7};
        
        for (int i=0; i < vet.length; i++)
        {
            btree.add(btree.getRoot(), new Node(vet[i]));
        }
        
        btree.show();
    }
}
