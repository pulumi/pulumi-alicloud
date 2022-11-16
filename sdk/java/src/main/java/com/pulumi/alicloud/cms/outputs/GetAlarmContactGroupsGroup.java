// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAlarmContactGroupsGroup {
    /**
     * @return The name of Alarm Contact Group.
     * 
     */
    private final String alarmContactGroupName;
    /**
     * @return The alarm contacts in the alarm group.
     * 
     */
    private final List<String> contacts;
    /**
     * @return The description of the Alarm Group.
     * 
     */
    private final String describe;
    /**
     * @return Indicates whether the alarm group subscribes to weekly reports.
     * 
     */
    private final Boolean enableSubscribed;
    /**
     * @return The ID of the CMS.
     * 
     */
    private final String id;

    @CustomType.Constructor
    private GetAlarmContactGroupsGroup(
        @CustomType.Parameter("alarmContactGroupName") String alarmContactGroupName,
        @CustomType.Parameter("contacts") List<String> contacts,
        @CustomType.Parameter("describe") String describe,
        @CustomType.Parameter("enableSubscribed") Boolean enableSubscribed,
        @CustomType.Parameter("id") String id) {
        this.alarmContactGroupName = alarmContactGroupName;
        this.contacts = contacts;
        this.describe = describe;
        this.enableSubscribed = enableSubscribed;
        this.id = id;
    }

    /**
     * @return The name of Alarm Contact Group.
     * 
     */
    public String alarmContactGroupName() {
        return this.alarmContactGroupName;
    }
    /**
     * @return The alarm contacts in the alarm group.
     * 
     */
    public List<String> contacts() {
        return this.contacts;
    }
    /**
     * @return The description of the Alarm Group.
     * 
     */
    public String describe() {
        return this.describe;
    }
    /**
     * @return Indicates whether the alarm group subscribes to weekly reports.
     * 
     */
    public Boolean enableSubscribed() {
        return this.enableSubscribed;
    }
    /**
     * @return The ID of the CMS.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAlarmContactGroupsGroup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String alarmContactGroupName;
        private List<String> contacts;
        private String describe;
        private Boolean enableSubscribed;
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAlarmContactGroupsGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alarmContactGroupName = defaults.alarmContactGroupName;
    	      this.contacts = defaults.contacts;
    	      this.describe = defaults.describe;
    	      this.enableSubscribed = defaults.enableSubscribed;
    	      this.id = defaults.id;
        }

        public Builder alarmContactGroupName(String alarmContactGroupName) {
            this.alarmContactGroupName = Objects.requireNonNull(alarmContactGroupName);
            return this;
        }
        public Builder contacts(List<String> contacts) {
            this.contacts = Objects.requireNonNull(contacts);
            return this;
        }
        public Builder contacts(String... contacts) {
            return contacts(List.of(contacts));
        }
        public Builder describe(String describe) {
            this.describe = Objects.requireNonNull(describe);
            return this;
        }
        public Builder enableSubscribed(Boolean enableSubscribed) {
            this.enableSubscribed = Objects.requireNonNull(enableSubscribed);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }        public GetAlarmContactGroupsGroup build() {
            return new GetAlarmContactGroupsGroup(alarmContactGroupName, contacts, describe, enableSubscribed, id);
        }
    }
}