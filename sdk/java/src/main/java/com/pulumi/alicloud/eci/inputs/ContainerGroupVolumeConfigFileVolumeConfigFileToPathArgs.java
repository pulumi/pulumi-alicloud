// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eci.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ContainerGroupVolumeConfigFileVolumeConfigFileToPathArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContainerGroupVolumeConfigFileVolumeConfigFileToPathArgs Empty = new ContainerGroupVolumeConfigFileVolumeConfigFileToPathArgs();

    @Import(name="content")
    private @Nullable Output<String> content;

    public Optional<Output<String>> content() {
        return Optional.ofNullable(this.content);
    }

    @Import(name="path")
    private @Nullable Output<String> path;

    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    private ContainerGroupVolumeConfigFileVolumeConfigFileToPathArgs() {}

    private ContainerGroupVolumeConfigFileVolumeConfigFileToPathArgs(ContainerGroupVolumeConfigFileVolumeConfigFileToPathArgs $) {
        this.content = $.content;
        this.path = $.path;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerGroupVolumeConfigFileVolumeConfigFileToPathArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerGroupVolumeConfigFileVolumeConfigFileToPathArgs $;

        public Builder() {
            $ = new ContainerGroupVolumeConfigFileVolumeConfigFileToPathArgs();
        }

        public Builder(ContainerGroupVolumeConfigFileVolumeConfigFileToPathArgs defaults) {
            $ = new ContainerGroupVolumeConfigFileVolumeConfigFileToPathArgs(Objects.requireNonNull(defaults));
        }

        public Builder content(@Nullable Output<String> content) {
            $.content = content;
            return this;
        }

        public Builder content(String content) {
            return content(Output.of(content));
        }

        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        public Builder path(String path) {
            return path(Output.of(path));
        }

        public ContainerGroupVolumeConfigFileVolumeConfigFileToPathArgs build() {
            return $;
        }
    }

}