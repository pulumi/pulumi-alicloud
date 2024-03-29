// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.kms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationAccessPointState extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationAccessPointState Empty = new ApplicationAccessPointState();

    /**
     * Application Access Point Name.
     * 
     */
    @Import(name="applicationAccessPointName")
    private @Nullable Output<String> applicationAccessPointName;

    /**
     * @return Application Access Point Name.
     * 
     */
    public Optional<Output<String>> applicationAccessPointName() {
        return Optional.ofNullable(this.applicationAccessPointName);
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
    @Import(name="policies")
    private @Nullable Output<List<String>> policies;

    /**
     * @return The policies that have bound to the Application Access Point (AAP).
     * 
     */
    public Optional<Output<List<String>>> policies() {
        return Optional.ofNullable(this.policies);
    }

    private ApplicationAccessPointState() {}

    private ApplicationAccessPointState(ApplicationAccessPointState $) {
        this.applicationAccessPointName = $.applicationAccessPointName;
        this.description = $.description;
        this.policies = $.policies;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationAccessPointState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationAccessPointState $;

        public Builder() {
            $ = new ApplicationAccessPointState();
        }

        public Builder(ApplicationAccessPointState defaults) {
            $ = new ApplicationAccessPointState(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationAccessPointName Application Access Point Name.
         * 
         * @return builder
         * 
         */
        public Builder applicationAccessPointName(@Nullable Output<String> applicationAccessPointName) {
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
        public Builder policies(@Nullable Output<List<String>> policies) {
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

        public ApplicationAccessPointState build() {
            return $;
        }
    }

}
