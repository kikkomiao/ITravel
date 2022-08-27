package com.example.itravel.entity;

public class TicketType {
    private String ticketTypeID;
    private String typeName;
    public String getTicketTypeID() {
        return ticketTypeID;
    }
    public void setTicketTypeID(String ticketTypeID) {
        this.ticketTypeID = ticketTypeID;
    }
    public String getTypeName() {
        return typeName;
    }
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
    public TicketType(String ticketTypeID, String typeName) {
        this.ticketTypeID = ticketTypeID;
        this.typeName = typeName;
    }
    @Override
    public String toString() {
        return "TicketType [ticketTypeID=" + ticketTypeID + ", typeName=" + typeName + "]";
    }
}
