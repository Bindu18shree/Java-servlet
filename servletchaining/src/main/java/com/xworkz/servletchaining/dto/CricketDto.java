package com.xworkz.servletchaining.dto;

public class CricketDto {

    private String tournamentName;
    private String location;
    private String startDate;
    private String endDate;
    private String format;
    private String status;
    private double prizeMoney;
    private int noOfTeams;

    public CricketDto(String tournamentName, String location, String startDate, String endDate, String format, String status, double prizeMoney, int noOfTeams) {
        this.tournamentName = tournamentName;
        this.location = location;
        this.startDate = startDate;
        this.endDate = endDate;
        this.format = format;
        this.status = status;
        this.prizeMoney = prizeMoney;
        this.noOfTeams = noOfTeams;
    }

    public String getTournamentName() {
        return tournamentName;
    }

    public void setTournamentName(String tournamentName) {
        this.tournamentName = tournamentName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getPrizeMoney() {
        return prizeMoney;
    }

    public void setPrizeMoney(double prizeMoney) {
        this.prizeMoney = prizeMoney;
    }

    public int getNoOfTeams() {
        return noOfTeams;
    }

    public void setNoOfTeams(int noOfTeams) {
        this.noOfTeams = noOfTeams;
    }

    @Override
    public String toString() {
        return "CricketDto{" +
                "tournamentName='" + tournamentName + '\'' +
                ", location='" + location + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", format='" + format + '\'' +
                ", status='" + status + '\'' +
                ", prizeMoney=" + prizeMoney +
                ", noOfTeams=" + noOfTeams +
                '}';
    }
}
