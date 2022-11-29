import java.util.EventListener;

public interface PlayerListener extends EventListener {
    public void playerStatChanged(PlayerStatChangedEvent event);
}