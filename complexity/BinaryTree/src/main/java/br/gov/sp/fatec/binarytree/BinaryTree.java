/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gov.sp.fatec.binarytree;
public class BinaryTree {

    private Node root;

    public BinaryTree() {
        this.root = null;
    }

    public Node getRoot() {
        return root;
    }

    // Mantém o nome do método
    public void add(Node root, Node node) {
        // se a árvore ainda está vazia, define a raiz
        if (this.root == null) {
            this.root = node;
            return;
        }

        // segurança: se por acaso vier root nulo, começa pela raiz real
        if (root == null) {
            add(this.root, node);
            return;
        }

        if (node.getInfo() <= root.getInfo()) {
            if (root.getLeftNode() == null) {
                root.setLeftNode(node);
            } else {
                add(root.getLeftNode(), node);
            }
        } else {
            if (root.getRightNode() == null) {
                root.setRightNode(node);
            } else {
                add(root.getRightNode(), node);
            }
        }
    }

    private void showInOrder(Node node) {
        if (node != null) {
            showInOrder(node.getLeftNode());     // visita esquerda
            System.out.print(node.getInfo() + "\n"); // visita raiz
            showInOrder(node.getRightNode());    // visita direita
        }
    }

    // Método para iniciar a impressão
    public void show() {
        showInOrder(this.root);
        System.out.println(); // só quebra linha
    }
}

