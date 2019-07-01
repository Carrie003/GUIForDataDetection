package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.transformation.FilteredList;
import javafx.scene.Scene;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.scene.control.cell.*;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.collections.ObservableList;
import javafx.collections.transformation.SortedList;

import java.util.*;
import javafx.event.ActionEvent;


import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
public class Main extends Application {


    private final String TIME_STAMP = "time_stamp";
    private final String USERNAME = "username";
    private final String SAMPLE = "sample";
    private final String CONTROL = "control";
    private final String WINDOW_ID = "window_id";
    private final String GENE = "gene";
    private final String AVG_CNV_RATIO = "avg_cnv_ratio";
    private final String AVG_BOWTIE_BWA_RATIO = "avg_bowtie_bwa_ratio";
    private final String BB_STD = "bb_std";
    private final String CNV_RATIO_STD = "cnv_ratio_std";
    private final String COV_STD = "cov_std";
    private final String AVG_COV = "avg_cov";
    private final String AVG_DUP_RATIO = " avg_dup_ratio";
    private final String GC_PERC = " gc_perc";
    private final String ALLELE_FREQ = "allele_freq";
    private final String READ_STATS = "read_stats";
    private final String IS_TRAINING = " is_training";
    private final String HET_CLASSIFICATION = "het_classification";

    private TableView<Data> geneDataTable = new TableView<>();

    private TableColumn<Data, String> timeStampCol;
    private TableColumn<Data, String> userNameCol = new TableColumn<>(USERNAME);
    private TableColumn<Data, String> sampleCol = new TableColumn<>(SAMPLE);
    private TableColumn<Data, String> controlCol = new TableColumn<>(CONTROL);
    private TableColumn<Data, String> windowIdCol;
    private TableColumn<Data, String> geneCol = new TableColumn<>(GENE);
    private TableColumn<Data, String> avgCnvRatioCol;
    private TableColumn<Data, String> avgBowtieBwaCol;
    private TableColumn<Data, String> bbStdCol;
    private TableColumn<Data, String> cnvRatioStdCol;
    private TableColumn<Data, String> covStdCol;
    private TableColumn<Data, String> avgCovCol;
    private TableColumn<Data, String> avgDupRatioCol;
    private TableColumn<Data, String> gcPercCol;
    private TableColumn<Data, String> alleleFreqCol;
    private TableColumn<Data, String> readStatsCol;
    private TableColumn<Data, String> isTrainingCol;
    private TableColumn<Data, String> hetClassificationCol;

    private ArrayList<Data> dataArrayList;

    private Stage primaryStage;

    private Button logIn, signUp;
    private GridPane grid1, grid2, grid3;
    private ComboBox dataComboBox;
    private BarChart barChart;
    private TextField filterField;
    private Button updateButton, clearButton, addColumnButton, addDataButton, backButtonScene2, backButtonScene3;
    private Scene newScene;
    private Button viewGraph;

    private Button clearAddButton;


    private TextField timeStampUpdateArea, userNameUpdateArea, sampleUpdateArea, controlUpdateArea, windowIdUpdateArea, geneUpdateArea, avgCnvRatioUpdateArea, avgBowtieBwaUpdateArea, bbStdUpdateArea,
            cnvRatioStdUpdateArea, covStdUpdateArea, avgCovUpdateArea, avgDupRatioUpdateArea, gcPercUpdateArea, alleleFreqUpdateArea, readStatsUpdateArea,
            isTrainingUpdateArea, hetClassificationUpdateArea;


    private Label updateTime_stamp, updateUsername, updateSample, updateControl, updateWindow_id, updateGene,
            updateAvg_cnv_ratio, updateAvg_bowtie_ratio, updateBb_std, updateCnv_ratio_std, updateCov_std, updateAvg_cov , updateAvg_dup_ratio , updateGc_perc , updateAllele_freq, updateRead_stats,updateIs_training ,updatehet_classification;


    public Main() {

        grid1 = new GridPane();
        grid2 = new GridPane();
        grid3 = new GridPane();


        dataArrayList = new ArrayList<>();
        dataArrayList.add(
                new Data("2019-05-30 15:46:00",
                        "onson001",
                        "16_01291",
                        "16_00577",
                        "chrX:595352-595412",
                        "SHOX",
                        "0.480286431774935",
                        "0.957607665628609",
                        "0.0215856543818301",
                        "0.377638880615974",
                        "11.4802753151427",
                        "61.2622950819672",
                        "1.22088746472313",
                        "0.55",
                        "0.00409447250105237",
                        "3",
                        "0",
                        "1"));

        dataArrayList.add(new Data("2019-05-30 15:46:00", "onson001",
                "16_01291",
                "16_00577",
                "chrX:591693-591753",
                "SHOX",
                "0.471388184601367",
                "0.976463266579998",
                "0.011171484121179",
                "0.399653450347011",
                "8.73026267295537",
                "110.55737704918",
                "1.31976786020128",
                "0.583333",
                "0.00122989910679051",
                "11",
                "0", "1")

        );
        dataArrayList.add(new Data("2019-05-30 15:46:00",
                "onson001",
                "16_01291",
                "16_00577",
                "chrX:595352-595412",
                "SHOX",
                "0.480286431774935",
                "0.957607665628609",
                "0.0215856543818301",
                "0.377638880615974",
                "11.4802753151427",
                "61.2622950819672",
                "1.22088746472313",
                "0.55",
                "0.00409447250105237",
                "3",
                "0",
                "1"));

        dataArrayList.add(new Data(
                "2019-05-30 15:46:00",
                "onson001",
                "16_01291",
                "16_00577",
                "chr13:32911055-32911115",
                "BRCA2",
                "0.663217392910916",
                "0.783719307260855",
                "0.0637871019865799",
                "0.184625628152167",
                "6.97846022442094",
                "73.0327868852459",
                "1.29321322934933",
                "0.25",
                "0.001701960560872",
                "2",
                "0",
                "1"));

        dataArrayList.add(new Data(
                "2019-05-30 15:46:00",
                "onson001",
                "16_01291",
                "16_00577",
                "chr16:89831419-89831474",
                "FANCA",
                "0.633506432325126",
                "0.992684185212584",
                "0.0162543676458943",
                "0.232076122713516",
                "8.14477364095146",
                "40.3392857142857",
                "1.25872712527323",
                "0.49090",
                "0",
                "1",
                "0",
                "1"));




    }




    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {


        primaryStage.setTitle("GUI for gene data detection");

        this.primaryStage = primaryStage;

        Scene scene1 = new Scene(grid1, 500, 500);
        scene1.getStylesheets().add(getClass().getResource("GUI.css").toExternalForm());
        primaryStage.setScene(scene1);
        primaryStage.show();


        Scene scene2 = new Scene(grid2, 2000, 2000);
        scene2.getStylesheets().add(getClass().getResource("GUI.css").toExternalForm());


        Scene scene3 = new Scene(grid3, 700, 500);
        scene3.getStylesheets().add(getClass().getResource("GUI3.css").toExternalForm());

        newScene = scene3;

        createLogInPage();

        createGUIMainPage();

        initializeDataComboBox();

        createTable();

        filterData();

        updateData();

        setEditable();

        logIn.setOnAction(e -> primaryStage.setScene(scene2));

        signUp.setOnAction(e -> primaryStage.setScene(scene2));

        viewGraph.setOnAction(e -> createBarChart());

        addColumnButton.setOnAction(e -> addColumn());

        clearButton.setOnAction(e -> clear());

        backButtonScene2.setOnAction(e -> primaryStage.setScene(scene1));

        backButtonScene3.setOnAction(e -> primaryStage.setScene(scene2));

        addDataButton.setOnAction(e -> addData());

        clearAddButton.setOnAction(e -> clearAdd());


    }



    public void createLogInPage() {


        Text welcomeText = new Text("Welcome");
        GridPane.setConstraints(welcomeText, 0, 1);
        welcomeText.getStyleClass().add("welcome-text");


        Label usernameLabel = new Label("User Name:");
        GridPane.setConstraints(usernameLabel, 0, 2);


        TextField username = new TextField();
        GridPane.setConstraints(username, 1, 2);


        Label passwordLabel = new Label("Password:");
        GridPane.setConstraints(passwordLabel, 0, 3);
        PasswordField password = new PasswordField();
        GridPane.setConstraints(password, 1, 3);


        logIn = new Button("Log In");
        GridPane.setConstraints(logIn, 1, 4);
        logIn.getStyleClass().add("logIn-button");

        signUp = new Button("Sign Up");
        GridPane.setConstraints(signUp, 1, 5);
        signUp.getStyleClass().add("signUp-button");



        grid1.getChildren().addAll(welcomeText, usernameLabel, username, passwordLabel, password, logIn, signUp);


    }
    private void createGUIMainPage(){


        updateTime_stamp = new Label("time_stamp");
        GridPane.setConstraints(updateTime_stamp, 0, 11);

        timeStampUpdateArea = new TextField();
        GridPane.setConstraints(timeStampUpdateArea, 1, 11);

        updateUsername = new Label("username");
        GridPane.setConstraints(updateUsername, 0, 12);

        userNameUpdateArea = new TextField();
        GridPane.setConstraints(userNameUpdateArea, 1, 12);


        updateSample = new Label("sample");
        GridPane.setConstraints(updateSample, 0, 13);

        sampleUpdateArea = new TextField();
        GridPane.setConstraints(sampleUpdateArea, 1, 13);

        updateControl = new Label("control");
        GridPane.setConstraints(updateControl, 0, 14);

        controlUpdateArea = new TextField();
        GridPane.setConstraints(controlUpdateArea, 1, 14);

        updateWindow_id = new Label("window_id");
        GridPane.setConstraints(updateWindow_id, 0, 15);

        windowIdUpdateArea = new TextField();
        GridPane.setConstraints(windowIdUpdateArea, 1, 15);

        updateGene = new Label("gene");
        GridPane.setConstraints(updateGene, 0, 16);

        geneUpdateArea = new TextField();
        GridPane.setConstraints(geneUpdateArea, 1, 16);

        updateAvg_cnv_ratio = new Label("avg_cnv_ratio");
        GridPane.setConstraints(updateAvg_cnv_ratio, 0, 17);

        avgCnvRatioUpdateArea = new TextField();
        GridPane.setConstraints(avgCnvRatioUpdateArea, 1, 17);

        updateAvg_bowtie_ratio = new Label("avg_bowtie_bwa");
        GridPane.setConstraints(updateAvg_bowtie_ratio, 0, 18);

        avgBowtieBwaUpdateArea = new TextField();
        GridPane.setConstraints(avgBowtieBwaUpdateArea, 1, 18);

        updateBb_std = new Label("bb_std");
        GridPane.setConstraints(updateBb_std, 0, 19);

        bbStdUpdateArea = new TextField();
        GridPane.setConstraints(bbStdUpdateArea, 1, 19);

        updateCnv_ratio_std = new Label("cnv_ratio_std");
        GridPane.setConstraints(updateCnv_ratio_std, 0, 20);

        cnvRatioStdUpdateArea = new TextField();
        GridPane.setConstraints(cnvRatioStdUpdateArea, 1, 20);

        updateCov_std = new Label("cov_std");
        GridPane.setConstraints(updateCov_std, 0, 21);

        covStdUpdateArea = new TextField();
        GridPane.setConstraints(covStdUpdateArea, 1, 21);

        updateAvg_cov = new Label("avg_cov");
        GridPane.setConstraints(updateAvg_cov, 0, 22);

        avgCovUpdateArea = new TextField();
        GridPane.setConstraints(avgCovUpdateArea, 1, 22);

        updateAvg_dup_ratio = new Label("avg_dup_ratio");
        GridPane.setConstraints(updateAvg_dup_ratio, 0, 23);

        avgDupRatioUpdateArea = new TextField();
        GridPane.setConstraints(avgDupRatioUpdateArea, 1, 23);

        updateGc_perc = new Label("gc_perc");
        GridPane.setConstraints(updateGc_perc, 0, 24);

        gcPercUpdateArea = new TextField();
        GridPane.setConstraints(gcPercUpdateArea, 1, 24);

        updateAllele_freq = new Label("allele_freq");
        GridPane.setConstraints(updateAllele_freq, 0, 25);

        alleleFreqUpdateArea = new TextField();
        GridPane.setConstraints(alleleFreqUpdateArea, 1, 25);

        updateRead_stats = new Label("read_stats");
        GridPane.setConstraints(updateRead_stats, 0, 26);

        readStatsUpdateArea = new TextField();
        GridPane.setConstraints(readStatsUpdateArea, 1, 26);

        updateIs_training = new Label("is_training");
        GridPane.setConstraints(updateIs_training, 0, 27);

        isTrainingUpdateArea = new TextField();
        GridPane.setConstraints(isTrainingUpdateArea, 1, 27);

        updatehet_classification = new Label("het_classification");
        GridPane.setConstraints(updatehet_classification, 0, 28);

        hetClassificationUpdateArea = new TextField();
        GridPane.setConstraints(hetClassificationUpdateArea, 1, 28);


        viewGraph = new Button("view Graph");

        GridPane.setConstraints(viewGraph, 3, 31);
        viewGraph.getStyleClass().add("view-graph");


        updateButton = new Button("Add");
        GridPane.setConstraints(updateButton, 1, 29);
        updateButton.getStyleClass().add("update-button");

        addColumnButton = new Button("Add Column");
        GridPane.setConstraints(addColumnButton, 2, 8);
        addColumnButton.getStyleClass().add("add-column-button");

        clearButton = new Button("Clear");
        GridPane.setConstraints(clearButton, 3, 8);
        clearButton.getStyleClass().add("clear-button");


        backButtonScene2 = new Button("back");
        GridPane.setConstraints(backButtonScene2, 4, 31);
        backButtonScene2.getStyleClass().add("back-button-2");

        backButtonScene3 = new Button("back");
        GridPane.setConstraints(backButtonScene3, 3, 30);
        backButtonScene3.getStyleClass().add("back-button-3");

        addDataButton = new Button ("Add new data set");
        GridPane.setConstraints(addDataButton, 1, 10);
        addDataButton.getStyleClass().add("add-data-button");

        clearAddButton = new Button ("Clear");
        GridPane.setConstraints(clearAddButton, 2, 10);
        clearAddButton.getStyleClass().add("clear-add-button");

        Label searchLabel = new Label("Filter by data type");
        GridPane.setConstraints(searchLabel, 0, 7);

        dataComboBox = new ComboBox();
        GridPane.setConstraints(dataComboBox, 1, 8);

        Label searchDataLabel = new Label("Enter data to filter");
        GridPane.setConstraints(searchDataLabel, 0, 9);


        filterField = new TextField();
        GridPane.setConstraints(filterField, 1, 9);

        timeStampUpdateArea.setText("");
        userNameUpdateArea.setText("");
        sampleUpdateArea.setText("");
        controlUpdateArea.setText("");
        windowIdUpdateArea.setText("");
        geneUpdateArea.setText("");
        avgCnvRatioUpdateArea.setText("");
        avgBowtieBwaUpdateArea.setText("");
        bbStdUpdateArea.setText("");

        cnvRatioStdUpdateArea.setText("");
        covStdUpdateArea.setText("");
        avgCovUpdateArea.setText("");
        avgDupRatioUpdateArea.setText("");
        gcPercUpdateArea.setText("");
        alleleFreqUpdateArea.setText("");
        readStatsUpdateArea.setText("");

        isTrainingUpdateArea.setText("");
        hetClassificationUpdateArea.setText("");

        geneDataTable.setEditable(true);

        geneDataTable.getSelectionModel().cellSelectionEnabledProperty().set(true);


        grid2.getChildren().addAll(searchDataLabel,  searchLabel, geneDataTable, filterField, dataComboBox, viewGraph, addColumnButton, clearButton, backButtonScene2, addDataButton, clearAddButton);
    }


    public void createTable() {

        geneDataTable.setEditable(true);


        initializeTable();
        setEditable();

        GridPane.setConstraints(geneDataTable, 1, 30);


    }

    public ObservableList<Data> dataCollection = FXCollections.observableArrayList(


    );




    public void initializeTable() {

        userNameCol.setCellValueFactory(new PropertyValueFactory<>(USERNAME));
        sampleCol.setCellValueFactory(new PropertyValueFactory<>(SAMPLE));
        controlCol.setCellValueFactory(new PropertyValueFactory<>(CONTROL));
        geneCol.setCellValueFactory(new PropertyValueFactory<>(GENE));

        geneDataTable.getColumns().addAll(userNameCol, sampleCol, controlCol, geneCol);
        for (Data data : dataArrayList) {
            dataCollection.add(data);
        }

        geneDataTable.setItems(dataCollection);

    }

    public void addColumn() {
        try {
            if (dataComboBox.getValue().toString().equals(AVG_CNV_RATIO)) {
                avgCnvRatioCol = new TableColumn<>(AVG_CNV_RATIO);
                avgCnvRatioCol.setCellValueFactory(new PropertyValueFactory<>(AVG_CNV_RATIO));
                dataCollection.clear();
                for (Data data : dataArrayList) {
                    dataCollection.add(data);
                }

                geneDataTable.getColumns().add(avgCnvRatioCol);
            }

            else if (dataComboBox.getValue().toString().equals(TIME_STAMP)) {
                timeStampCol = new TableColumn<>(TIME_STAMP);
                timeStampCol.setCellValueFactory(new PropertyValueFactory<>(TIME_STAMP));
                dataCollection.clear();
                for (Data data : dataArrayList) {
                    dataCollection.add(data);
                }

                geneDataTable.getColumns().add(timeStampCol);
            }





            else if (dataComboBox.getValue().toString().equals(WINDOW_ID)) {
                windowIdCol = new TableColumn<>(WINDOW_ID);
                windowIdCol.setCellValueFactory(new PropertyValueFactory<>(WINDOW_ID));
                dataCollection.clear();
                for (Data data : dataArrayList) {
                    dataCollection.add(data);
                }

                geneDataTable.getColumns().add(windowIdCol);

            }

            else if (dataComboBox.getValue().toString().equals(AVG_BOWTIE_BWA_RATIO)) {
                avgBowtieBwaCol = new TableColumn<>(AVG_BOWTIE_BWA_RATIO);
                avgBowtieBwaCol.setCellValueFactory(new PropertyValueFactory<>(AVG_BOWTIE_BWA_RATIO));
                dataCollection.clear();
                for (Data data : dataArrayList) {
                    dataCollection.add(data);
                }

                geneDataTable.getColumns().add(avgBowtieBwaCol);
            } else if (dataComboBox.getValue().toString().equals(BB_STD)) {
                bbStdCol = new TableColumn<>(BB_STD);
                bbStdCol.setCellValueFactory(new PropertyValueFactory<>(BB_STD));
                dataCollection.clear();
                for (Data data : dataArrayList) {
                    dataCollection.add(data);
                }

                geneDataTable.getColumns().add(bbStdCol);

            } else if (dataComboBox.getValue().toString().equals(CNV_RATIO_STD)) {
                cnvRatioStdCol = new TableColumn<>(CNV_RATIO_STD);
                cnvRatioStdCol.setCellValueFactory(new PropertyValueFactory<>(CNV_RATIO_STD));
                dataCollection.clear();
                for (Data data : dataArrayList) {
                    dataCollection.add(data);
                }

                geneDataTable.getColumns().add(cnvRatioStdCol);

            } else if (dataComboBox.getValue().toString().equals(COV_STD)) {
                covStdCol = new TableColumn<>(COV_STD);
                covStdCol.setCellValueFactory(new PropertyValueFactory<>(COV_STD));
                dataCollection.clear();
                for (Data data : dataArrayList) {
                    dataCollection.add(data);
                }

                geneDataTable.getColumns().add(covStdCol);

            } else if (dataComboBox.getValue().toString().equals(AVG_COV)) {
                avgCovCol = new TableColumn<>(AVG_CNV_RATIO);
                avgCovCol.setCellValueFactory(new PropertyValueFactory<>(AVG_CNV_RATIO));
                dataCollection.clear();
                for (Data data : dataArrayList) {
                    dataCollection.add(data);
                }

                geneDataTable.getColumns().add(avgCovCol);
            } else if (dataComboBox.getValue().toString().equals(
                    AVG_DUP_RATIO)) {
                avgDupRatioCol = new TableColumn<>(AVG_DUP_RATIO);
                avgDupRatioCol.setCellValueFactory(new PropertyValueFactory<>(AVG_DUP_RATIO));
                dataCollection.clear();
                for (Data data : dataArrayList) {
                    dataCollection.add(data);
                }

                geneDataTable.getColumns().add(avgDupRatioCol);

            } else if (dataComboBox.getValue().toString().equals(ALLELE_FREQ)) {
                alleleFreqCol = new TableColumn<>(ALLELE_FREQ);
                alleleFreqCol.setCellValueFactory(new PropertyValueFactory<>(ALLELE_FREQ));
                dataCollection.clear();
                for (Data data : dataArrayList) {
                    dataCollection.add(data);

                }

                geneDataTable.getColumns().add(alleleFreqCol);

            } else if (dataComboBox.getValue().toString().equals(GC_PERC)) {
                gcPercCol = new TableColumn<>(GC_PERC);
                gcPercCol.setCellValueFactory(new PropertyValueFactory<>(GC_PERC));
                dataCollection.clear();
                for (Data data : dataArrayList) {
                    dataCollection.add(data);
                }

                geneDataTable.getColumns().add(gcPercCol);

            } else if (dataComboBox.getValue().toString().equals(READ_STATS
            )) {
                readStatsCol = new TableColumn<>(READ_STATS);
                readStatsCol.setCellValueFactory(new PropertyValueFactory<>(READ_STATS));
                dataCollection.clear();
                for (Data data : dataArrayList) {
                    dataCollection.add(data);
                }

                geneDataTable.getColumns().add(readStatsCol);

            } else if (dataComboBox.getValue().toString().equals(IS_TRAINING


            )) {
                isTrainingCol = new TableColumn<>(IS_TRAINING);
                isTrainingCol.setCellValueFactory(new PropertyValueFactory<>(IS_TRAINING));
                dataCollection.clear();
                for (Data data : dataArrayList) {
                    dataCollection.add(data);
                }

                geneDataTable.getColumns().add(isTrainingCol);

            } else if (dataComboBox.getValue().toString().equals(HET_CLASSIFICATION)) {
                hetClassificationCol = new TableColumn<>(HET_CLASSIFICATION);
                hetClassificationCol.setCellValueFactory(new PropertyValueFactory<>(HET_CLASSIFICATION));
                dataCollection.clear();
                for (Data data : dataArrayList) {
                    dataCollection.add(data);
                }

                geneDataTable.getColumns().add(hetClassificationCol);

            }

            else{
                System.out.println();
            }



        } catch (Exception e) {
            System.out.println("no data type chosen");
        }

        setEditable();


    }



    public void initializeDataComboBox() {


        ObservableList<String> options =
                FXCollections.observableArrayList(
                        TIME_STAMP,
                        USERNAME,
                        SAMPLE,
                        CONTROL,
                        WINDOW_ID,
                        GENE,
                        AVG_CNV_RATIO,
                        AVG_BOWTIE_BWA_RATIO,
                        BB_STD,
                        CNV_RATIO_STD,
                        COV_STD,
                        AVG_COV,
                        AVG_DUP_RATIO,
                        ALLELE_FREQ,
                        GC_PERC,
                        READ_STATS,
                        IS_TRAINING,
                        HET_CLASSIFICATION

                );
        dataComboBox.setItems(options);


    }

    public void clear() {
        geneDataTable.getColumns().clear();
        geneDataTable.getColumns().addAll(userNameCol, sampleCol, controlCol, geneCol);


    }




    public void filterData() {
        FilteredList<Data> filteredData = new FilteredList<>(dataCollection, p -> true);

        filterField.textProperty().addListener((observable, oldValue, newValue) -> {

            filteredData.setPredicate(data -> {


                if (newValue == null || newValue.isEmpty()) {


                    return true;
                }

                String lowerCaseFilter = newValue;


                if (findDataType(data).contains(lowerCaseFilter)) {

                    return true;
                }
                return false;
            });
            SortedList<Data> sortedData = new SortedList<>(filteredData);

            sortedData.comparatorProperty().bind(geneDataTable.comparatorProperty());

            geneDataTable.setItems(sortedData);
        });

    }

    public String findDataType(Data data) {

        String var = null;

        if (dataComboBox.getValue().toString().equals(TIME_STAMP)) {
            var = data.getTime_stamp();
        } else if (dataComboBox.getValue().toString().equals(USERNAME)) {
            var = data.getUsername();
        } else if (dataComboBox.getValue().toString().equals(SAMPLE)) {
            var = data.getSample();
        } else if (dataComboBox.getValue().toString().equals(CONTROL)) {
            var = data.getControl();

        } else if (dataComboBox.getValue().toString().equals(WINDOW_ID)) {
            var = data.getWindow_id();

        } else if (dataComboBox.getValue().toString().equals(GENE)) {
            var = data.getGene();

        } else if (dataComboBox.getValue().toString().equals(AVG_CNV_RATIO)) {
            var = (data.getAvg_cnv_ratio());
        } else if (dataComboBox.getValue().toString().equals(AVG_BOWTIE_BWA_RATIO)) {
            var = (data.getAvg_bowtie_bwa_ratio());
        } else if (dataComboBox.getValue().toString().equals(BB_STD)) {
            var = (data.getBb_std());

        } else if (dataComboBox.getValue().toString().equals(CNV_RATIO_STD)) {
            var = (data.getCnv_ratio_std());

        } else if (dataComboBox.getValue().toString().equals(COV_STD)) {
            var = (data.getCov_std());

        } else if (dataComboBox.getValue().toString().equals(AVG_COV)) {
            var = (data.getAvg_cov());
        } else if (dataComboBox.getValue().toString().equals(
                AVG_DUP_RATIO)) {
            var = (data.getAvg_dup_ratio());

        } else if (dataComboBox.getValue().toString().equals(ALLELE_FREQ)) {
            var = (data.getAllele_freq());

        } else if (dataComboBox.getValue().toString().equals(GC_PERC)) {
            var = (data.getGc_perc());

        } else if (dataComboBox.getValue().toString().equals(READ_STATS
        )) {
            var = data.getRead_stats();

        } else if (dataComboBox.getValue().toString().equals(IS_TRAINING


        )) {
            var = data.getIs_training();

        } else if (dataComboBox.getValue().toString().equals(HET_CLASSIFICATION)) {
            var = data.getHet_classification();

        }
        return var;


    }

    public void addData(){

        try {

            grid2.getChildren().addAll(updateAllele_freq, updateAvg_bowtie_ratio, updateAvg_cnv_ratio, updateAvg_cov, updateAvg_dup_ratio, updateBb_std, updateCnv_ratio_std, updateControl, updateCov_std, updateGc_perc, updateGene, updateIs_training, updateRead_stats, updateSample, updateTime_stamp, updatehet_classification, updateUsername, updateWindow_id, timeStampUpdateArea, userNameUpdateArea, sampleUpdateArea, alleleFreqUpdateArea, avgBowtieBwaUpdateArea, avgCnvRatioUpdateArea, avgCovUpdateArea, avgDupRatioUpdateArea, bbStdUpdateArea, cnvRatioStdUpdateArea, controlUpdateArea, covStdUpdateArea, windowIdUpdateArea, gcPercUpdateArea, readStatsUpdateArea, isTrainingUpdateArea, geneUpdateArea, updateButton, hetClassificationUpdateArea);
        }

        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public void clearAdd(){


        grid2.getChildren().remove(updateButton);


        grid2.getChildren().remove(updateAvg_bowtie_ratio);
        grid2.getChildren().remove(updateAvg_cnv_ratio);
        grid2.getChildren().remove(updateAvg_dup_ratio);
        grid2.getChildren().remove(updateAllele_freq);
        grid2.getChildren().remove(updateAvg_cov);
        grid2.getChildren().remove(updateBb_std);
        grid2.getChildren().remove(updateCnv_ratio_std);
        grid2.getChildren().remove(updateControl);
        grid2.getChildren().remove(updateGc_perc);
        grid2.getChildren().remove(updateCov_std);
        grid2.getChildren().remove(updatehet_classification);
        grid2.getChildren().remove(updateIs_training);
        grid2.getChildren().remove(updateGene);
        grid2.getChildren().remove(updateWindow_id);
        grid2.getChildren().remove(updateRead_stats);
        grid2.getChildren().remove(updateTime_stamp);
        grid2.getChildren().remove(updateSample);
        grid2.getChildren().remove(updateUsername);


        grid2.getChildren().remove(avgBowtieBwaUpdateArea);
        grid2.getChildren().remove(avgCnvRatioUpdateArea);
        grid2.getChildren().remove(avgDupRatioUpdateArea);
        grid2.getChildren().remove(alleleFreqUpdateArea);
        grid2.getChildren().remove(avgCovUpdateArea);
        grid2.getChildren().remove(bbStdUpdateArea);
        grid2.getChildren().remove(cnvRatioStdUpdateArea);
        grid2.getChildren().remove(controlUpdateArea);
        grid2.getChildren().remove(gcPercUpdateArea);
        grid2.getChildren().remove(covStdUpdateArea);
        grid2.getChildren().remove(hetClassificationUpdateArea);
        grid2.getChildren().remove(isTrainingUpdateArea);
        grid2.getChildren().remove(geneUpdateArea);
        grid2.getChildren().remove(windowIdUpdateArea);
        grid2.getChildren().remove(readStatsUpdateArea);
        grid2.getChildren().remove(timeStampUpdateArea);
        grid2.getChildren().remove(sampleUpdateArea);
        grid2.getChildren().remove(userNameUpdateArea);

    }


    public void updateData() {



        updateButton.setOnAction((ActionEvent e) -> {
            dataArrayList.add(new Data(

                    timeStampUpdateArea.getText(),
                    userNameUpdateArea.getText(),
                    sampleUpdateArea.getText(),
                    controlUpdateArea.getText(),
                    windowIdUpdateArea.getText(),
                    geneUpdateArea.getText(),
                    avgCnvRatioUpdateArea.getText(),
                    avgBowtieBwaUpdateArea.getText(),
                    bbStdUpdateArea.getText(),
                    cnvRatioStdUpdateArea.getText(),
                    covStdUpdateArea.getText(),
                    avgCovUpdateArea.getText(),
                    avgDupRatioUpdateArea.getText(),
                    gcPercUpdateArea.getText(),


                    alleleFreqUpdateArea.getText(),
                    readStatsUpdateArea.getText(),
                    isTrainingUpdateArea.getText(),

                    hetClassificationUpdateArea.getText()));


            timeStampUpdateArea.setText("");
            userNameUpdateArea.setText("");
            sampleUpdateArea.setText("");
            controlUpdateArea.setText("");
            windowIdUpdateArea.setText("");
            geneUpdateArea.setText("");
            avgCnvRatioUpdateArea.setText("");
            avgBowtieBwaUpdateArea.setText("");
            bbStdUpdateArea.setText("");

            cnvRatioStdUpdateArea.setText("");
            covStdUpdateArea.setText("");
            avgCovUpdateArea.setText("");
            avgDupRatioUpdateArea.setText("");
            gcPercUpdateArea.setText("");
            alleleFreqUpdateArea.setText("");
            readStatsUpdateArea.setText("");

            isTrainingUpdateArea.setText("");
            hetClassificationUpdateArea.setText("");


            dataCollection.add(dataArrayList.get(dataArrayList.size() - 1));
            geneDataTable.setItems(dataCollection);


        });


    }


    public void setEditable() {

        try {


            timeStampCol.setCellFactory(TextFieldTableCell.forTableColumn());
            timeStampCol.setOnEditCommit(
                    (CellEditEvent<Data, String> t) -> {
                        ((Data) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        ).setTime_stamp(t.getNewValue());
                    });

            sampleCol.setCellFactory(TextFieldTableCell.forTableColumn());

            sampleCol.setOnEditCommit(
                    (CellEditEvent<Data, String> t) -> {
                        ((Data) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        ).setSample(t.getNewValue());
                    });

            userNameCol.setCellFactory(TextFieldTableCell.forTableColumn());

            userNameCol.setOnEditCommit(
                    (CellEditEvent<Data, String> t) -> {
                        ((Data) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        ).setUsername(t.getNewValue());
                    });

            controlCol.setCellFactory(TextFieldTableCell.forTableColumn());

            controlCol.setOnEditCommit(
                    (CellEditEvent<Data, String> t) -> {
                        ((Data) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        ).setControl((t.getNewValue()));


                    });

            windowIdCol.setCellFactory(TextFieldTableCell.forTableColumn());

            windowIdCol.setOnEditCommit(
                    (CellEditEvent<Data, String> t) -> {
                        ((Data) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        ).setWindow_id((t.getNewValue()));


                    });


            geneCol.setCellFactory(TextFieldTableCell.forTableColumn());

            geneCol.setOnEditCommit(
                    (CellEditEvent<Data, String> t) -> {
                        ((Data) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        ).setGene(t.getNewValue());


                    });

            avgCnvRatioCol.setCellFactory(TextFieldTableCell.forTableColumn());

            avgCnvRatioCol.setOnEditCommit(
                    (CellEditEvent<Data, String> t) -> {
                        ((Data) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        ).setAvg_cnv_ratio(t.getNewValue());


                    });
            avgBowtieBwaCol.setCellFactory(TextFieldTableCell.forTableColumn());

            avgBowtieBwaCol.setOnEditCommit(
                    (CellEditEvent<Data, String> t) -> {
                        ((Data) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        ).setAvg_bowtie_bwa_ratio((t.getNewValue()));


                    });


            bbStdCol.setCellFactory(TextFieldTableCell.forTableColumn());

            bbStdCol.setOnEditCommit(
                    (CellEditEvent<Data, String> t) -> {
                        ((Data) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        ).setBb_std((t.getNewValue()));


                    });

            cnvRatioStdCol.setCellFactory(TextFieldTableCell.forTableColumn());

            cnvRatioStdCol.setOnEditCommit(
                    (CellEditEvent<Data, String> t) -> {
                        ((Data) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        ).setCnv_ratio_std((t.getNewValue()));


                    });
            covStdCol.setCellFactory(TextFieldTableCell.forTableColumn());

            covStdCol.setOnEditCommit(
                    (CellEditEvent<Data, String> t) -> {
                        ((Data) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        ).setCov_std(t.getNewValue());


                    });


            geneCol.setCellFactory(TextFieldTableCell.forTableColumn());

            geneCol.setOnEditCommit(
                    (CellEditEvent<Data, String> t) -> {
                        ((Data) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        ).setGene(t.getNewValue());


                    });

            avgCovCol.setCellFactory(TextFieldTableCell.forTableColumn());

            avgCovCol.setOnEditCommit(
                    (CellEditEvent<Data, String> t) -> {
                        ((Data) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        ).setAvg_cov((t.getNewValue()));


                    });
            avgDupRatioCol.setCellFactory(TextFieldTableCell.forTableColumn());

            avgDupRatioCol.setOnEditCommit(
                    (CellEditEvent<Data, String> t) -> {
                        ((Data) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        ).setAvg_dup_ratio((t.getNewValue()));


                    });


            gcPercCol.setCellFactory(TextFieldTableCell.forTableColumn());
            gcPercCol.setOnEditCommit(
                    (CellEditEvent<Data, String> t) -> {
                        ((Data) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        ).setGc_perc((t.getNewValue()));
                    });
            alleleFreqCol.setCellFactory(TextFieldTableCell.forTableColumn());
            alleleFreqCol.setOnEditCommit(
                    (CellEditEvent<Data, String> t) -> {
                        ((Data) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        ).setAllele_freq((t.getNewValue()));
                    });

            readStatsCol.setCellFactory(TextFieldTableCell.forTableColumn());
            readStatsCol.setOnEditCommit(
                    (CellEditEvent<Data, String> t) -> {
                        ((Data) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        ).setRead_stats((t.getNewValue()));
                    });
            isTrainingCol.setCellFactory(TextFieldTableCell.forTableColumn());
            isTrainingCol.setOnEditCommit(
                    (CellEditEvent<Data, String> t) -> {
                        ((Data) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        ).setIs_training((t.getNewValue()));
                    });

            hetClassificationCol.setCellFactory(TextFieldTableCell.forTableColumn());
            hetClassificationCol.setOnEditCommit(
                    (CellEditEvent<Data, String> t) -> {
                        ((Data) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        ).setHet_classification(t.getNewValue());
                    });
        } catch (Exception e) {
            System.out.println(e);
        }


    }


    public void createBarChart() {


        primaryStage.setScene(newScene);


        CategoryAxis xAxis = new CategoryAxis();

        xAxis.setLabel("");
        xAxis.setLabel("gene types");


        XYChart.Series dataSeries = new XYChart.Series();
        dataSeries.setName(AVG_CNV_RATIO);

        XYChart.Series dataSeries2 = new XYChart.Series();
        dataSeries2.setName(AVG_BOWTIE_BWA_RATIO);

        XYChart.Series dataSeries3 = new XYChart.Series();
        dataSeries3.setName(BB_STD);

        XYChart.Series dataSeries4 = new XYChart.Series();
        dataSeries4.setName(CNV_RATIO_STD);

        XYChart.Series dataSeries5 = new XYChart.Series();
        dataSeries5.setName(COV_STD);

        XYChart.Series dataSeries6 = new XYChart.Series();
        dataSeries6.setName(AVG_COV);


        XYChart.Series dataSeries7 = new XYChart.Series();
        dataSeries7.setName(AVG_DUP_RATIO);

        XYChart.Series dataSeries8 = new XYChart.Series();
        dataSeries8.setName(GC_PERC);


        XYChart.Series dataSeries9 = new XYChart.Series();
        dataSeries9.setName(ALLELE_FREQ);

        XYChart.Series dataSeries10 = new XYChart.Series();
        dataSeries10.setName(READ_STATS);

        XYChart.Series dataSeries11 = new XYChart.Series();
        dataSeries11.setName(IS_TRAINING);

        XYChart.Series dataSeries12 = new XYChart.Series();
        dataSeries12.setName(HET_CLASSIFICATION);


        dataSeries.getData().clear();
        dataSeries2.getData().clear();
        dataSeries3.getData().clear();
        dataSeries4.getData().clear();
        dataSeries5.getData().clear();

        dataSeries6.getData().clear();
        dataSeries7.getData().clear();
        dataSeries8.getData().clear();
        dataSeries9.getData().clear();

        dataSeries10.getData().clear();
        dataSeries11.getData().clear();
        dataSeries12.getData().clear();
        dataSeries12.getData().clear();



        ArrayList<String> genes = new ArrayList<>();

        genes.clear();
        for (Data data : dataArrayList) {
            String newGene = data.getGene();
            if (!genes.contains(newGene)) {
                genes.add(newGene);

            }

        }

        NumberAxis yAxis = new NumberAxis();

        yAxis.setLabel("average data value");

        grid3.getChildren().clear();


        barChart = new BarChart(xAxis, yAxis);
        barChart.getData().clear();

        if (geneDataTable.getColumns().contains(avgCnvRatioCol)) {


            double total = 0.0;
            double average;
            dataSeries.getData().clear();

            for (String gene : genes) {
                int n = 0;
                for (Data data : dataArrayList) {
                    if (data.getGene().equals(gene)) {
                        total += Double.valueOf(data.getAvg_cnv_ratio());
                        n++;

                    }
                }


                average = total / n;
                dataSeries.getData().add(new XYChart.Data(gene, average));


            }
            barChart.getData().add(dataSeries);


        }
        if (geneDataTable.getColumns().contains(avgBowtieBwaCol)) {

            double total = 0.0;
            double average;
            dataSeries2.getData().clear();
            for (String gene : genes) {
                int n = 0;
                for (Data data : dataArrayList) {
                    if (data.getGene().equals(gene)) {

                        total += Double.valueOf(data.getAvg_bowtie_bwa_ratio());
                        n++;
                    }
                }


                average = total / n;
                dataSeries2.getData().add(new XYChart.Data(gene, average));


            }

            barChart.getData().add(dataSeries2);
        }
        if (geneDataTable.getColumns().contains(bbStdCol)) {
            double total = 0.0;
            double average;
            dataSeries3.getData().clear();

            for (String gene : genes) {
                int n = 0;
                for (Data data : dataArrayList) {
                    if (data.getGene().equals(gene)) {

                        total += Double.valueOf(data.getBb_std());
                        n++;
                    }
                }


                average = total / n;
                dataSeries3.getData().add(new XYChart.Data(gene, average));


            }
            barChart.getData().add(dataSeries3);

        }
        if (geneDataTable.getColumns().contains(cnvRatioStdCol)) {
            double total = 0.0;
            double average;
            dataSeries4.getData().clear();

            for (String gene : genes) {
                int n = 0;
                for (Data data : dataArrayList) {
                    if (data.getGene().equals(gene)) {

                        total += Double.valueOf(data.getCnv_ratio_std());
                        n++;
                    }
                }


                average = total / n;
                dataSeries4.getData().add(new XYChart.Data(gene, average));


            }
            barChart.getData().add(dataSeries4);

        }
        if (geneDataTable.getColumns().contains(covStdCol)) {
            double total = 0.0;
            double average;
            dataSeries5.getData().clear();

            for (String gene : genes) {
                int n = 0;
                for (Data data : dataArrayList) {
                    if (data.getGene().equals(gene)) {

                        total += Double.valueOf(data.getCov_std());
                        n++;
                    }
                }


                average = total / n;
                dataSeries5.getData().add(new XYChart.Data(gene, average));


            }

            barChart.getData().add(dataSeries5);

        }
        if (geneDataTable.getColumns().contains(avgCovCol)) {
            double total = 0.0;
            double average;
            dataSeries6.getData().clear();

            for (String gene : genes) {
                int n = 0;
                for (Data data : dataArrayList) {
                    if (data.getGene().equals(gene)) {

                        total += Double.valueOf(data.getAvg_cov());
                        n++;
                    }
                }


                average = total / n;
                dataSeries6.getData().add(new XYChart.Data(gene, average));


            }
            barChart.getData().add(dataSeries6);
        }
        if (geneDataTable.getColumns().contains(avgDupRatioCol)) {
            double total = 0.0;
            double average;
            dataSeries.getData().clear();

            for (String gene : genes) {
                int n = 0;
                for (Data data : dataArrayList) {
                    if (data.getGene().equals(gene)) {

                        total += Double.valueOf(data.getAvg_dup_ratio());
                        n++;
                    }
                }


                average = total / n;

                dataSeries7.getData().add(new XYChart.Data(gene, average));


            }
            barChart.getData().add(dataSeries7);

        }
        if (geneDataTable.getColumns().contains(alleleFreqCol)) {
            double total = 0.0;
            double average;
            dataSeries8.getData().clear();

            for (String gene : genes) {
                int n = 0;
                for (Data data : dataArrayList) {
                    if (data.getGene().equals(gene)) {

                        total += Double.valueOf(data.getAllele_freq());
                        n++;
                    }
                }


                average = total / n;
                dataSeries8.getData().add(new XYChart.Data(gene, average));


            }
            barChart.getData().add(dataSeries8);

        }
        if (geneDataTable.getColumns().contains(gcPercCol)) {
            double total = 0.0;
            double average;
            dataSeries9.getData().clear();

            for (String gene : genes) {
                int n = 0;
                for (Data data : dataArrayList) {
                    if (data.getGene().equals(gene)){

                        total += Double.valueOf(data.getGc_perc());
                        n++;
                    }
                }


                average = total / n;
                dataSeries9.getData().add(new XYChart.Data(gene, average));


            }
            barChart.getData().add(dataSeries9);

        }
        if (geneDataTable.getColumns().contains(readStatsCol)) {
            double total = 0.0;
            double average;
            dataSeries10.getData().clear();

            for (String gene : genes) {
                int n = 0;
                for (Data data : dataArrayList) {
                    if (data.getGene().equals(gene)) {

                        total += Double.valueOf(data.getRead_stats());
                        n++;
                    }
                }


                average = total / n;
                dataSeries10.getData().add(new XYChart.Data(gene, average));



            }
            barChart.getData().add(dataSeries10);

        } if (geneDataTable.getColumns().contains(isTrainingCol)) {
            double total = 0.0;
            double average;
            dataSeries11.getData().clear();

            for (String gene : genes) {
                int n = 0;
                for (Data data : dataArrayList) {
                    if (data.getGene().equals(gene)) {

                        total += Double.valueOf(data.getIs_training());
                        n++;
                    }
                }


                average = total / n;
                dataSeries11.getData().add(new XYChart.Data(gene, average));



            }
            barChart.getData().add(dataSeries11);

        } if (geneDataTable.getColumns().contains(hetClassificationCol)) {
            double total = 0.0;
            double average;
            dataSeries12.getData().clear();

            for (String gene : genes) {
                int n = 0;
                for (Data data : dataArrayList) {
                    if (data.getGene().equals(gene)) {

                        total += Double.valueOf(data.getHet_classification());
                        n++;
                    }
                }


                average = total / n;
                dataSeries12.getData().add(new XYChart.Data(gene, average));



            }
            barChart.getData().add(dataSeries12);

        }

        grid3.getChildren().add(backButtonScene3);

        grid3.getChildren().add(barChart);


    }
}



