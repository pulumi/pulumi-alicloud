// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ram.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGroupsGroup {
    /**
     * @return Comments of the group.
     * 
     */
    private final String comments;
    /**
     * @return Name of the group.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private GetGroupsGroup(
        @CustomType.Parameter("comments") String comments,
        @CustomType.Parameter("name") String name) {
        this.comments = comments;
        this.name = name;
    }

    /**
     * @return Comments of the group.
     * 
     */
    public String comments() {
        return this.comments;
    }
    /**
     * @return Name of the group.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupsGroup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String comments;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGroupsGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comments = defaults.comments;
    	      this.name = defaults.name;
        }

        public Builder comments(String comments) {
            this.comments = Objects.requireNonNull(comments);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GetGroupsGroup build() {
            return new GetGroupsGroup(comments, name);
        }
    }
}