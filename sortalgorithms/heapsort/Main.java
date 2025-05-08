import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main extends JPanel {
    private final int[] vetor;

    public Main(int[] vetor) {
        this.vetor = vetor;
        setPreferredSize(new Dimension(800, 600));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (vetor.length > 0) {
            desenharArvore(g, 0, getWidth() / 2, 50, getWidth() / 4);
        }
    }

    private void desenharArvore(Graphics g, int index, int x, int y, int deslocamento) {
        if (index >= vetor.length) return;

        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(x - 15, y - 15, 30, 30);
        g.setColor(Color.BLACK);
        g.drawString(String.valueOf(vetor[index]), x - 5, y + 5);

        int filhoEsquerda = 2 * index + 1;
        int filhoDireita = 2 * index + 2;

        g.setColor(Color.BLACK);
        if (filhoEsquerda < vetor.length) {
            int xFilho = x - deslocamento;
            int yFilho = y + 60;
            g.drawLine(x, y, xFilho, yFilho);
            desenharArvore(g, filhoEsquerda, xFilho, yFilho, deslocamento / 2);
        }
        if (filhoDireita < vetor.length) {
            int xFilho = x + deslocamento;
            int yFilho = y + 60;
            g.drawLine(x, y, xFilho, yFilho);
            desenharArvore(g, filhoDireita, xFilho, yFilho, deslocamento / 2);
        }
    }

    public static void main(String[] args) {
        int vector[] = {10,1,41,53,12,15,33,44,99,116,110,11,9,4,17};
		int vectorin[] = {10,1,41,53,12,15,33,44,99,116,110,11,9,4,17};
        int vectorsort[] = {10,1,41,53,12,15,33,44,99,116,110,11,9,4,17};
        JFrame frame = new JFrame("Entrada");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Main(vectorin));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
		
		JFrame framein = new JFrame("Heap maximo");
        framein.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Heap heap = new Heap();
        heap.maxHeap(vector);
        framein.add(new Main(vector));
        framein.pack();
        framein.setLocationRelativeTo(null);
        framein.setVisible(true);

        JFrame frameHS = new JFrame("Heap Sort");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        HeapSort heapSort = new HeapSort();
        heapSort.sort(vectorsort);
        
        frameHS.add(new Main(vectorsort));
        frameHS.pack();
        frameHS.setLocationRelativeTo(null);
        frameHS.setVisible(true);
    }
}


