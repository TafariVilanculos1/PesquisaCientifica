/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author tafarivilanculos
 */
import Control.ControlPesquisa;
import Model.PesquisaCientifica;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class TelaRegistroPesquisa extends javax.swing.JFrame implements ObserverGraficos {

    /**
     * Creates new form TelaRegistroPesquisa
     */
    private java.util.List<PesquisaCientifica> listaPesquisas = new java.util.ArrayList<>();
    ControlPesquisa cp = new ControlPesquisa();
   

  

    public TelaRegistroPesquisa() {
         initComponents(); // inicializa o painelGraficos
    painelGraficos.setLayout(new java.awt.GridLayout(1, 2)); // define o layout aqui
    adicionarGraficos();
    cp.adicionarListaObserevers(this);
    
 

        //Criei isso para entrarem na lista de observers// adiciona os gráficos
    }
    
    
      
       private void adicionarGraficos() {
        painelGraficos.add(criarGraficoBarra());
        painelGraficos.add(criarGraficoPizza());
    }
    
    private ChartPanel criarGraficoBarra() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(5, "Pesquisas", "Programação");
        dataset.addValue(3, "Pesquisas", "IA");
        dataset.addValue(2, "Pesquisas", "Engenharia");
        dataset.addValue(4, "Pesquisas", "Dados");

        JFreeChart grafico = ChartFactory.createBarChart(
            "Pesquisas por Área",
            "Área",
            "Quantidade",
            dataset
        );

        return new ChartPanel(grafico);
    }
    
    
     private ChartPanel criarGraficoPizza() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Programação", 1000);
        dataset.setValue("IA", 2500);
        dataset.setValue("Engenharia", 1500);
        dataset.setValue("Dados", 2000);

        JFreeChart grafico = ChartFactory.createPieChart(
            "Distribuição de Orçamentos",
            dataset,
            true, true, false
        );

        return new ChartPanel(grafico);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboArea = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtAnoPublicacao = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNumeroParticipantes = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtOrcamento = new javax.swing.JTextField();
        btnGravarPesquisa = new javax.swing.JButton();
        painelGraficos = new javax.swing.JPanel();

        jLabel2.setText("Titulo");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setFont(new java.awt.Font("KufiStandardGK", 1, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Sathu", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SISTEMA DE PESQUISA CIÊNTIFICA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(247, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(195, 195, 195))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel3)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 90));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(807, 123, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel4.setText("Titulo");

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel5.setText("Autor");

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel6.setText("Area de Estudo");

        comboArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Programação", "Inteligencia Artificial", "Engenharia de Software", "Analise de Dados" }));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel7.setText("Ano de Publicação");

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel9.setText("Número de Participantes");

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel10.setText("Orçamento");

        btnGravarPesquisa.setBackground(new java.awt.Color(51, 51, 255));
        btnGravarPesquisa.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnGravarPesquisa.setForeground(new java.awt.Color(255, 255, 255));
        btnGravarPesquisa.setText("GRAVAR PESQUISA");
        btnGravarPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarPesquisaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(33, 33, 33)
                        .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(comboArea, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtOrcamento))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(6, 6, 6)
                                .addComponent(txtAnoPublicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumeroParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(btnGravarPesquisa))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel4))
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(comboArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtAnoPublicacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(txtNumeroParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGravarPesquisa))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 88, 830, 160));

        javax.swing.GroupLayout painelGraficosLayout = new javax.swing.GroupLayout(painelGraficos);
        painelGraficos.setLayout(painelGraficosLayout);
        painelGraficosLayout.setHorizontalGroup(
            painelGraficosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        painelGraficosLayout.setVerticalGroup(
            painelGraficosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        getContentPane().add(painelGraficos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 830, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGravarPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarPesquisaActionPerformed
       
       String areaSelecionada = comboArea.getSelectedItem().toString();
       double orcamento = Double.parseDouble(txtOrcamento.getText());
  
       cp.adicionarPesquisa(new PesquisaCientifica(areaSelecionada,orcamento));
     
         // TODO add your handling code here:
                 // Atualiza os gráficos
      
    }//GEN-LAST:event_btnGravarPesquisaActionPerformed

    private ChartPanel criarGraficoBarraDinamico(List<PesquisaCientifica> listaPesquisas) {
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    java.util.Map<String, Integer> contador = new java.util.HashMap<>();

    for (PesquisaCientifica p : listaPesquisas) {
        contador.put(p.getAreaDeEstudo(), contador.getOrDefault(p.getAreaDeEstudo(), 0) + 1);
    }

    for (String area : contador.keySet()) {
        dataset.addValue(contador.get(area), "Pesquisas", area);
    }

    JFreeChart grafico = ChartFactory.createBarChart(
        "Pesquisas por Área",
        "Área",
        "Quantidade",
        dataset
    );

    return new ChartPanel(grafico);
}

private ChartPanel criarGraficoPizzaDinamico(List<PesquisaCientifica> listaPesquisas) {
    DefaultPieDataset dataset = new DefaultPieDataset();
    java.util.Map<String, Double> orcamentos = new java.util.HashMap<>();

    for (PesquisaCientifica p : listaPesquisas) {
        orcamentos.put(p.getAreaDeEstudo(), orcamentos.getOrDefault(p.getAreaDeEstudo(), 0.0) + p.getOrcamento());
    }

    for (String area : orcamentos.keySet()) {
        dataset.setValue(area, orcamentos.get(area));
    }

    JFreeChart grafico = ChartFactory.createPieChart(
        "Distribuição de Orçamentos",
        dataset,
        true, true, false
    );

    return new ChartPanel(grafico);
}

   
    
 
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaRegistroPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRegistroPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRegistroPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRegistroPesquisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRegistroPesquisa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGravarPesquisa;
    public javax.swing.JComboBox<String> comboArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JPanel painelGraficos;
    public javax.swing.JTextField txtAnoPublicacao;
    public javax.swing.JTextField txtAutor;
    public javax.swing.JTextField txtNumeroParticipantes;
    private javax.swing.JTextField txtOrcamento;
    public javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actualizar() {
        painelGraficos.removeAll();
        painelGraficos.setLayout(new java.awt.GridLayout(1, 2));
        painelGraficos.add(criarGraficoPizzaDinamico(cp.listaDePesquisas()));
        painelGraficos.add(criarGraficoBarraDinamico(cp.listaDePesquisas()));
        painelGraficos.revalidate();
        painelGraficos.repaint();
    }
   
   
}

