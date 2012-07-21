
public class mod_LoadNEIPlugins extends BaseMod {
    public String getVersion() {
        return "1.2.5";
    }

    public void load() {
        System.out.println("Loading NEI plugins");
    }

    public String getPriorities() {
        return "after:*";
    }
}
