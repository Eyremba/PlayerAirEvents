package wa.was.playerairevents.events;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;


public class PlayerLandedEvent extends Event {

	private static final HandlerList HANDLERS = new HandlerList();
	public static HandlerList getHandlerList() {
        return HANDLERS;
    }
	private Integer fallen;
	private Boolean isCancelled;
	private Location from;
	private Integer jumped;
	
	private Player player;
	
	private Location to;
	
    public PlayerLandedEvent(Player player, Integer fallen, Integer jumped, Location from, Location to) {
		this.player = player;
		this.fallen = fallen;
		this.jumped = jumped;
		this.from = from;
		this.to = to;
    }

    public Integer getFallenBlocks() {
		return this.fallen;
	}
    
    public Location getFrom() {
    	return this.from;
    }
	
    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public Integer getJumpedBlocks() {
		return this.jumped;
	}
	
	public Player getPlayer() {
		return this.player;
	}
	
	public Location getTo() {
    	return this.to;
    }
	
	public boolean isCancelled() {
        return this.isCancelled;
    }

    public void setCancelled(boolean isCancelled) {
        this.isCancelled = isCancelled;
    }
    
}
