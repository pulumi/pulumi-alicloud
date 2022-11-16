// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAclsAclAclEntry {
    /**
     * @return Access Control Entries Note Description Length Is Limited to 1 to 256 Characters, Letters, digital, the Dash (-), a Forward Slash (/), Half a Period (.) and Underscores (_), Support Chinese Characters.
     * 
     */
    private final String description;
    private final String entry;
    /**
     * @return The state of the ACL. Valid values:`Provisioning` , `Available` and `Configuring`. `Provisioning`: The ACL is being created. `Available`: The ACL is available. `Configuring`: The ACL is being configured.
     * 
     */
    private final String status;

    @CustomType.Constructor
    private GetAclsAclAclEntry(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("entry") String entry,
        @CustomType.Parameter("status") String status) {
        this.description = description;
        this.entry = entry;
        this.status = status;
    }

    /**
     * @return Access Control Entries Note Description Length Is Limited to 1 to 256 Characters, Letters, digital, the Dash (-), a Forward Slash (/), Half a Period (.) and Underscores (_), Support Chinese Characters.
     * 
     */
    public String description() {
        return this.description;
    }
    public String entry() {
        return this.entry;
    }
    /**
     * @return The state of the ACL. Valid values:`Provisioning` , `Available` and `Configuring`. `Provisioning`: The ACL is being created. `Available`: The ACL is available. `Configuring`: The ACL is being configured.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAclsAclAclEntry defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String entry;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAclsAclAclEntry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.entry = defaults.entry;
    	      this.status = defaults.status;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder entry(String entry) {
            this.entry = Objects.requireNonNull(entry);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public GetAclsAclAclEntry build() {
            return new GetAclsAclAclEntry(description, entry, status);
        }
    }
}