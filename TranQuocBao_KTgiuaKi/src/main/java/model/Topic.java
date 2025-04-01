package model;

public class Topic {
    private String id;
    private String topicName;
    private String supervisorId;
    private String topicType;

    // Constructors, Getters, Setters
    public Topic() {}
    
    public Topic(String id, String topicName, String supervisorId, String topicType) {
        this.id = id;
        this.topicName = topicName;
        this.supervisorId = supervisorId;
        this.topicType = topicType;
    }

	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}

    // Getters & Setters (generate these in your IDE)
}