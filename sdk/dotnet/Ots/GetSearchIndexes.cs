// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ots
{
    public static class GetSearchIndexes
    {
        public static Task<GetSearchIndexesResult> InvokeAsync(GetSearchIndexesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSearchIndexesResult>("alicloud:ots/getSearchIndexes:getSearchIndexes", args ?? new GetSearchIndexesArgs(), options.WithDefaults());

        public static Output<GetSearchIndexesResult> Invoke(GetSearchIndexesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSearchIndexesResult>("alicloud:ots/getSearchIndexes:getSearchIndexes", args ?? new GetSearchIndexesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSearchIndexesArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        [Input("instanceName", required: true)]
        public string InstanceName { get; set; } = null!;

        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        [Input("tableName", required: true)]
        public string TableName { get; set; } = null!;

        public GetSearchIndexesArgs()
        {
        }
        public static new GetSearchIndexesArgs Empty => new GetSearchIndexesArgs();
    }

    public sealed class GetSearchIndexesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        [Input("instanceName", required: true)]
        public Input<string> InstanceName { get; set; } = null!;

        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        [Input("tableName", required: true)]
        public Input<string> TableName { get; set; } = null!;

        public GetSearchIndexesInvokeArgs()
        {
        }
        public static new GetSearchIndexesInvokeArgs Empty => new GetSearchIndexesInvokeArgs();
    }


    [OutputType]
    public sealed class GetSearchIndexesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly ImmutableArray<Outputs.GetSearchIndexesIndexResult> Indexes;
        public readonly string InstanceName;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly string TableName;

        [OutputConstructor]
        private GetSearchIndexesResult(
            string id,

            ImmutableArray<string> ids,

            ImmutableArray<Outputs.GetSearchIndexesIndexResult> indexes,

            string instanceName,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            string tableName)
        {
            Id = id;
            Ids = ids;
            Indexes = indexes;
            InstanceName = instanceName;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            TableName = tableName;
        }
    }
}