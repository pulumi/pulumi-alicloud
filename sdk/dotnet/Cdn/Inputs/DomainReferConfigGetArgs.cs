// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cdn.Inputs
{

    public sealed class DomainReferConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("allowEmpty")]
        public Input<string>? AllowEmpty { get; set; }

        [Input("referLists", required: true)]
        private InputList<string>? _referLists;
        public InputList<string> ReferLists
        {
            get => _referLists ?? (_referLists = new InputList<string>());
            set => _referLists = value;
        }

        [Input("referType")]
        public Input<string>? ReferType { get; set; }

        public DomainReferConfigGetArgs()
        {
        }
        public static new DomainReferConfigGetArgs Empty => new DomainReferConfigGetArgs();
    }
}
