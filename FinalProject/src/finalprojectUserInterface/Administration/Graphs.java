/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package finalprojectUserInterface.Administration;

import finalprojectBackend.DB4OUtility.DB4OUtility;
import finalprojectBackend.OperatingSystem.OperatingSystem;
import finalprojectBackend.Organization.DonationAssignment;

import finalprojectUserInterface.MainJFrameForm;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.util.PublicCloneable;

/**
 *
 * @author supriyaa
 */
public class Graphs extends javax.swing.JPanel {

    /**
     * Creates new form Graphs
     */
    MainJFrameForm MainLPage;
    //FirebaseHelper firebaseHelper;
    private OperatingSystem operatingSystem;
    private DB4OUtility dB4OUtility;

    public Graphs(MainJFrameForm MainLPage, DB4OUtility dB4OUtility, OperatingSystem operatingSystem) {
        initComponents();
        this.MainLPage = MainLPage;
        this.dB4OUtility = dB4OUtility;
        this.operatingSystem = operatingSystem;
        
        initComponents();
        
        display();
    }
    
    private static final int N = 128;
    private static final Random random = new Random();
    
    private ChartPanel createEntityNameChartPanel() {
        final XYSeries series = new XYSeries("Data");
        for (int i = 0; i < random.nextInt(N) + N / 2; i++) {
            series.add(i, random.nextGaussian());
        }
        XYSeriesCollection dataset = new XYSeriesCollection(series);
        DefaultCategoryDataset dc = new DefaultCategoryDataset();
        
        Map<String, Integer> hm = new HashMap();
        for(DonationAssignment de: operatingSystem.getDonationAssignmentList()){
            String key = de.getDonationEntityName().toLowerCase();
            
            hm.put(key,  hm.containsKey(key)? 1+hm.get(key):1);
           
        }
        for(String k:hm.keySet()){
            System.out.println("key: "+k+": "+hm.get(k));
            dc.addValue(hm.get(k), "", k);
        }
        
        JFreeChart chart = ChartFactory.createBarChart("", "organ/blood",
            "Range", dc, PlotOrientation.VERTICAL, false, false, false);
        return new ChartPanel(chart) {
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(N * 2, N * 2);
            }
        };
    }
    
    private ChartPanel createEntityBloodChartPanel() {
        final XYSeries series = new XYSeries("Data");
        for (int i = 0; i < random.nextInt(N) + N / 2; i++) {
            series.add(i, random.nextGaussian());
        }
        XYSeriesCollection dataset = new XYSeriesCollection(series);
        DefaultCategoryDataset dc = new DefaultCategoryDataset();
        
        Map<String, Integer> hm = new HashMap();
        for(DonationAssignment de: operatingSystem.getDonationAssignmentList()){
            String key = de.getbGroup().toLowerCase();
            
            hm.put(key,  hm.containsKey(key)? 1+hm.get(key):1);
           
        }
        for(String k:hm.keySet()){
            System.out.println("key: "+k+": "+hm.get(k));
            dc.addValue(hm.get(k), "", k);
        }
        
        JFreeChart chart = ChartFactory.createBarChart("", "blood",
            "Range", dc, PlotOrientation.VERTICAL, false, false, false);
        return new ChartPanel(chart) {
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(N * 2, N * 2);
            }
        };
    }
    
    private ChartPanel createEntityEnterpriseChartPanel() {
        final XYSeries series = new XYSeries("Data");
        for (int i = 0; i < random.nextInt(N) + N / 2; i++) {
            series.add(i, random.nextGaussian());
        }
        XYSeriesCollection dataset = new XYSeriesCollection(series);
        DefaultCategoryDataset dc = new DefaultCategoryDataset();
        
        Map<String, Integer> hm = new HashMap();
        for(DonationAssignment de: operatingSystem.getDonationAssignmentList()){
            try{
            String key = de.getDonEnterprise().getEnterpriseName().toLowerCase();
            
            hm.put(key,  hm.containsKey(key)? 1+hm.get(key):1);
            }
            catch (Exception e){
                //e.printStackTrace();
            }
           
        }
        for(String k:hm.keySet()){
            System.out.println("key: "+k+": "+hm.get(k));
            dc.addValue(hm.get(k), "", k);
        }
        
        JFreeChart chart = ChartFactory.createBarChart("", "Donor Ent.",
            "Range", dc, PlotOrientation.VERTICAL, false, false, false);
        return new ChartPanel(chart) {
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(N * 2, N * 2);
            }
        };
    }
    
    private ChartPanel createEntityRecChartPanel() {
        final XYSeries series = new XYSeries("Data");
        for (int i = 0; i < random.nextInt(N) + N / 2; i++) {
            series.add(i, random.nextGaussian());
        }
        XYSeriesCollection dataset = new XYSeriesCollection(series);
        DefaultCategoryDataset dc = new DefaultCategoryDataset();
        
        Map<String, Integer> hm = new HashMap();
        for(DonationAssignment de: operatingSystem.getDonationAssignmentList()){
            try{
            String key = de.getRecEnterprise().getEnterpriseName().toLowerCase();
            
            hm.put(key,  hm.containsKey(key)? 1+hm.get(key):1);
            }
            catch (Exception e){
                //e.printStackTrace();
            }
           
        }
        for(String k:hm.keySet()){
            System.out.println("key: "+k+": "+hm.get(k));
            dc.addValue(hm.get(k), "", k);
        }
        
        JFreeChart chart = ChartFactory.createBarChart("", "Receiver Ent.",
            "Range", dc, PlotOrientation.VERTICAL, false, false, false);
        return new ChartPanel(chart) {
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(N * 2, N * 2);
            }
        };
    }
    
    private ChartPanel createStatusChartPanel() {
        final XYSeries series = new XYSeries("Data");
        for (int i = 0; i < random.nextInt(N) + N / 2; i++) {
            series.add(i, random.nextGaussian());
        }
 
        Map<String, Integer> hm = new HashMap();
        
        for(DonationAssignment de: operatingSystem.getDonationAssignmentList()){
            try{
            String key = de.getDonationStatus().toLowerCase();
            
            hm.put(key,  hm.containsKey(key)? 1+hm.get(key):1);
            }
            catch (Exception e){
               // e.printStackTrace();
            }
           
        }
        DefaultPieDataset ds = new DefaultPieDataset();
//      dataset.setValue( "IPhone 5s" , new Double( 20 ) );  
        for(String k:hm.keySet()){
            System.out.println("key: "+k+": "+hm.get(k));
            ds.setValue( k , Double.valueOf( hm.get(k) ) ); 
        }
        
        JFreeChart chart = ChartFactory.createPieChart("Status", 
         ds,        
         true,            
         true, 
         false);
        return new ChartPanel(chart) {
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(N * 2, N * 2);
            }
        };
    }
    
    private void display() {
        JFrame f = new JFrame("Test");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p = new JPanel(new GridLayout(1, 0));
        p.add(createEntityNameChartPanel());
        p.add(createEntityEnterpriseChartPanel());
        p.add(createEntityBloodChartPanel());
        p.add(createEntityRecChartPanel());
        p.add(createStatusChartPanel());
        f.add(p);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        jLabel1.setText("Graphs");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(483, 483, 483)
                .addComponent(jLabel1)
                .addContainerGap(510, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addContainerGap(627, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
