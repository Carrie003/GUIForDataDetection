package sample;

public class Data {



    String time_stamp, username, sample, control, window_id, gene, avg_cnv_ratio, avg_bowtie_bwa_ratio, bb_std, cnv_ratio_std, cov_std, avg_cov, avg_dup_ratio, gc_perc, allele_freq;
    String read_stats, is_training, het_classification;
    public Data(String time_stamp, String username, String sample, String control, String window_id, String gene, String avg_cnv_ratio, String avg_bowtie_bwa_ratio, String bb_std, String cnv_ratio_std, String cov_std,  String avg_cov,  String avg_dup_ratio,  String gc_perc,  String allele_freq, String read_stats, String is_training, String het_classification){

        this.time_stamp = time_stamp;
        this.username = username;
        this.sample = sample;
        this.control = control;
        this.window_id = window_id;
        this.gene = gene;
        this.avg_cnv_ratio = avg_cnv_ratio;
        this.avg_bowtie_bwa_ratio = avg_bowtie_bwa_ratio;
        this.bb_std = bb_std;
        this.cnv_ratio_std = cnv_ratio_std;
        this.cov_std = cov_std;
        this.avg_cov = avg_cov;
        this.avg_dup_ratio = avg_dup_ratio;
        this.gc_perc = gc_perc;
        this.allele_freq = allele_freq;
        this.read_stats =read_stats;
        this.is_training = is_training;
        this.het_classification = het_classification;

    }

    public String getTime_stamp() {
        return time_stamp;
    }

    public String getUsername() {
        return username;
    }

    public String getSample() {
        return sample;
    }

    public String getControl() {
        return control;
    }

    public String getWindow_id() {
        return window_id;
    }

    public String getGene() {
        return gene;
    }

    public  String getAvg_cnv_ratio() {
        return avg_cnv_ratio;
    }

    public  String getAvg_bowtie_bwa_ratio() {
        return avg_bowtie_bwa_ratio;
    }

    public  String getBb_std() {
        return bb_std;
    }

    public  String getCnv_ratio_std() {
        return cnv_ratio_std;
    }

    public  String getCov_std() {
        return cov_std;
    }

    public  String getAvg_cov() {
        return avg_cov;
    }

    public  String getAvg_dup_ratio() {
        return avg_dup_ratio;
    }

    public  String getGc_perc() {
        return gc_perc;
    }

    public  String getAllele_freq() {
        return allele_freq;
    }

    public String getRead_stats() {
        return read_stats;
    }

    public String getIs_training() {
        return is_training;
    }

    public String getHet_classification() {
        return het_classification;
    }

    public void setTime_stamp(String time_stamp) {
        this.time_stamp = time_stamp;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setSample(String sample) {
        this.sample = sample;
    }

    public void setControl(String control) {
        this.control = control;
    }

    public void setWindow_id(String window_id) {
        this.window_id = window_id;
    }

    public void setGene(String gene) {
        this.gene = gene;
    }

    public void setAvg_cnv_ratio( String avg_cnv_ratio) {
        this.avg_cnv_ratio = avg_cnv_ratio;
    }

    public void setAvg_bowtie_bwa_ratio( String avg_bowtie_bwa_ratio) {
        this.avg_bowtie_bwa_ratio = avg_bowtie_bwa_ratio;
    }

    public void setBb_std( String bb_std) {
        this.bb_std = bb_std;
    }

    public void setCnv_ratio_std( String cnv_ratio_std) {
        this.cnv_ratio_std = cnv_ratio_std;
    }

    public void setCov_std( String cov_std) {
        this.cov_std = cov_std;
    }

    public void setAvg_cov( String avg_cov) {
        this.avg_cov = avg_cov;
    }

    public void setAvg_dup_ratio  (String avg_dup_ratio) {
        this.avg_dup_ratio = avg_dup_ratio;
    }

    public void setGc_perc(  String gc_perc) {
        this.gc_perc = gc_perc;
    }

    public void setAllele_freq( String allele_freq) {
        this.allele_freq = allele_freq;
    }

    public void setRead_stats(String read_stats) {
        this.read_stats = read_stats;
    }

    public void setIs_training(String is_training) {
        this.is_training = is_training;
    }

    public void setHet_classification(String het_classification) {
        this.het_classification = het_classification;
    }



}

