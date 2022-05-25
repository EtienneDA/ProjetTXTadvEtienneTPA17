package modele;

public class ContentM {
    private int _id;
    private String story;
    private String choixg;
    private String choixd;

    public ContentM(int _id, String story, String choixg, String choixd) {
        this._id = _id;
        this.story = story;
        this.choixg = choixg;
        this.choixd = choixd;
    }

    public ContentM(String story, String choixg, String choixd) {
        this.story = story;
        this.choixg = choixg;
        this.choixd = choixd;
    }

    public ContentM(int _id, String story) {
        this._id = _id;
        this.story = story;
    }

    public ContentM() {
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public String getChoixg() {
        return choixg;
    }

    public void setChoixg(String choixg) {
        this.choixg = choixg;
    }

    public String getChoixd() {
        return choixd;
    }

    public void setChoixd(String choixd) {
        this.choixd = choixd;
    }

    @Override
    public String toString() {
        return "ContentM{" +
                "_id=" + _id +
                ", story='" + story + '\'' +
                ", choixg='" + choixg + '\'' +
                ", choixd='" + choixd + '\'' +
                '}';
    }
}
