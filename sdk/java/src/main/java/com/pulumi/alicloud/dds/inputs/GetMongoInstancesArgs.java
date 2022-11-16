// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dds.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMongoInstancesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMongoInstancesArgs Empty = new GetMongoInstancesArgs();

    @Import(name="availabilityZone")
    private @Nullable Output<String> availabilityZone;

    public Optional<Output<String>> availabilityZone() {
        return Optional.ofNullable(this.availabilityZone);
    }

    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    @Import(name="instanceClass")
    private @Nullable Output<String> instanceClass;

    public Optional<Output<String>> instanceClass() {
        return Optional.ofNullable(this.instanceClass);
    }

    @Import(name="instanceType")
    private @Nullable Output<String> instanceType;

    public Optional<Output<String>> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }

    @Import(name="nameRegex")
    private @Nullable Output<String> nameRegex;

    public Optional<Output<String>> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    @Import(name="tags")
    private @Nullable Output<Map<String,Object>> tags;

    public Optional<Output<Map<String,Object>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetMongoInstancesArgs() {}

    private GetMongoInstancesArgs(GetMongoInstancesArgs $) {
        this.availabilityZone = $.availabilityZone;
        this.ids = $.ids;
        this.instanceClass = $.instanceClass;
        this.instanceType = $.instanceType;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMongoInstancesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMongoInstancesArgs $;

        public Builder() {
            $ = new GetMongoInstancesArgs();
        }

        public Builder(GetMongoInstancesArgs defaults) {
            $ = new GetMongoInstancesArgs(Objects.requireNonNull(defaults));
        }

        public Builder availabilityZone(@Nullable Output<String> availabilityZone) {
            $.availabilityZone = availabilityZone;
            return this;
        }

        public Builder availabilityZone(String availabilityZone) {
            return availabilityZone(Output.of(availabilityZone));
        }

        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        public Builder instanceClass(@Nullable Output<String> instanceClass) {
            $.instanceClass = instanceClass;
            return this;
        }

        public Builder instanceClass(String instanceClass) {
            return instanceClass(Output.of(instanceClass));
        }

        public Builder instanceType(@Nullable Output<String> instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        public Builder instanceType(String instanceType) {
            return instanceType(Output.of(instanceType));
        }

        public Builder nameRegex(@Nullable Output<String> nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        public Builder nameRegex(String nameRegex) {
            return nameRegex(Output.of(nameRegex));
        }

        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        public Builder tags(@Nullable Output<Map<String,Object>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,Object> tags) {
            return tags(Output.of(tags));
        }

        public GetMongoInstancesArgs build() {
            return $;
        }
    }

}