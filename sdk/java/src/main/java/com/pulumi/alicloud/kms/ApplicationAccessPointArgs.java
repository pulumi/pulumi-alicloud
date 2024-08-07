// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.kms;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationAccessPointArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationAccessPointArgs Empty = new ApplicationAccessPointArgs();

    /**
     * Application Access Point Name.
     * 
     */
    @Import(name="applicationAccessPointName", required=true)
    private Output<String> applicationAccessPointName;

    /**
     * @return Application Access Point Name.
     * 
     */
    public Output<String> applicationAccessPointName() {
        return this.applicationAccessPointName;
    }

    /**
     * Description .
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description .
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The policies that have bound to the Application Access Point (AAP).
     * 
     */
    @Import(name="policies", required=true)
    private Output<List<String>> policies;

    /**
     * @return The policies that have bound to the Application Access Point (AAP).
     * 
     */
    public Output<List<String>> policies() {
        return this.policies;
    }

    private ApplicationAccessPointArgs() {}

    private ApplicationAccessPointArgs(ApplicationAccessPointArgs $) {
        this.applicationAccessPointName = $.applicationAccessPointName;
        this.description = $.description;
        this.policies = $.policies;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationAccessPointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationAccessPointArgs $;

        public Builder() {
            $ = new ApplicationAccessPointArgs();
        }

        public Builder(ApplicationAccessPointArgs defaults) {
            $ = new ApplicationAccessPointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationAccessPointName Application Access Point Name.
         * 
         * @return builder
         * 
         */
        public Builder applicationAccessPointName(Output<String> applicationAccessPointName) {
            $.applicationAccessPointName = applicationAccessPointName;
            return this;
        }

        /**
         * @param applicationAccessPointName Application Access Point Name.
         * 
         * @return builder
         * 
         */
        public Builder applicationAccessPointName(String applicationAccessPointName) {
            return applicationAccessPointName(Output.of(applicationAccessPointName));
        }

        /**
         * @param description Description .
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description .
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param policies The policies that have bound to the Application Access Point (AAP).
         * 
         * @return builder
         * 
         */
        public Builder policies(Output<List<String>> policies) {
            $.policies = policies;
            return this;
        }

        /**
         * @param policies The policies that have bound to the Application Access Point (AAP).
         * 
         * @return builder
         * 
         */
        public Builder policies(List<String> policies) {
            return policies(Output.of(policies));
        }

        /**
         * @param policies The policies that have bound to the Application Access Point (AAP).
         * 
         * @return builder
         * 
         */
        public Builder policies(String... policies) {
            return policies(List.of(policies));
        }

        public ApplicationAccessPointArgs build() {
            if ($.applicationAccessPointName == null) {
                throw new MissingRequiredPropertyException("ApplicationAccessPointArgs", "applicationAccessPointName");
            }
            if ($.policies == null) {
                throw new MissingRequiredPropertyException("ApplicationAccessPointArgs", "policies");
            }
            return $;
        }
    }

}
