// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cs.inputs;

import com.pulumi.alicloud.cs.inputs.ApplicationServiceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationState extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationState Empty = new ApplicationState();

    @Import(name="blueGreen")
    private @Nullable Output<Boolean> blueGreen;

    public Optional<Output<Boolean>> blueGreen() {
        return Optional.ofNullable(this.blueGreen);
    }

    @Import(name="blueGreenConfirm")
    private @Nullable Output<Boolean> blueGreenConfirm;

    public Optional<Output<Boolean>> blueGreenConfirm() {
        return Optional.ofNullable(this.blueGreenConfirm);
    }

    @Import(name="clusterName")
    private @Nullable Output<String> clusterName;

    public Optional<Output<String>> clusterName() {
        return Optional.ofNullable(this.clusterName);
    }

    @Import(name="defaultDomain")
    private @Nullable Output<String> defaultDomain;

    public Optional<Output<String>> defaultDomain() {
        return Optional.ofNullable(this.defaultDomain);
    }

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="environment")
    private @Nullable Output<Map<String,Object>> environment;

    public Optional<Output<Map<String,Object>>> environment() {
        return Optional.ofNullable(this.environment);
    }

    @Import(name="latestImage")
    private @Nullable Output<Boolean> latestImage;

    public Optional<Output<Boolean>> latestImage() {
        return Optional.ofNullable(this.latestImage);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="services")
    private @Nullable Output<List<ApplicationServiceArgs>> services;

    public Optional<Output<List<ApplicationServiceArgs>>> services() {
        return Optional.ofNullable(this.services);
    }

    @Import(name="template")
    private @Nullable Output<String> template;

    public Optional<Output<String>> template() {
        return Optional.ofNullable(this.template);
    }

    @Import(name="version")
    private @Nullable Output<String> version;

    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private ApplicationState() {}

    private ApplicationState(ApplicationState $) {
        this.blueGreen = $.blueGreen;
        this.blueGreenConfirm = $.blueGreenConfirm;
        this.clusterName = $.clusterName;
        this.defaultDomain = $.defaultDomain;
        this.description = $.description;
        this.environment = $.environment;
        this.latestImage = $.latestImage;
        this.name = $.name;
        this.services = $.services;
        this.template = $.template;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationState $;

        public Builder() {
            $ = new ApplicationState();
        }

        public Builder(ApplicationState defaults) {
            $ = new ApplicationState(Objects.requireNonNull(defaults));
        }

        public Builder blueGreen(@Nullable Output<Boolean> blueGreen) {
            $.blueGreen = blueGreen;
            return this;
        }

        public Builder blueGreen(Boolean blueGreen) {
            return blueGreen(Output.of(blueGreen));
        }

        public Builder blueGreenConfirm(@Nullable Output<Boolean> blueGreenConfirm) {
            $.blueGreenConfirm = blueGreenConfirm;
            return this;
        }

        public Builder blueGreenConfirm(Boolean blueGreenConfirm) {
            return blueGreenConfirm(Output.of(blueGreenConfirm));
        }

        public Builder clusterName(@Nullable Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        public Builder defaultDomain(@Nullable Output<String> defaultDomain) {
            $.defaultDomain = defaultDomain;
            return this;
        }

        public Builder defaultDomain(String defaultDomain) {
            return defaultDomain(Output.of(defaultDomain));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder environment(@Nullable Output<Map<String,Object>> environment) {
            $.environment = environment;
            return this;
        }

        public Builder environment(Map<String,Object> environment) {
            return environment(Output.of(environment));
        }

        public Builder latestImage(@Nullable Output<Boolean> latestImage) {
            $.latestImage = latestImage;
            return this;
        }

        public Builder latestImage(Boolean latestImage) {
            return latestImage(Output.of(latestImage));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder services(@Nullable Output<List<ApplicationServiceArgs>> services) {
            $.services = services;
            return this;
        }

        public Builder services(List<ApplicationServiceArgs> services) {
            return services(Output.of(services));
        }

        public Builder services(ApplicationServiceArgs... services) {
            return services(List.of(services));
        }

        public Builder template(@Nullable Output<String> template) {
            $.template = template;
            return this;
        }

        public Builder template(String template) {
            return template(Output.of(template));
        }

        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        public Builder version(String version) {
            return version(Output.of(version));
        }

        public ApplicationState build() {
            return $;
        }
    }

}